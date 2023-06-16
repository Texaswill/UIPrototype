package com.example.jddpbackend.controller;
import com.example.jddpbackend.entity.DishEntity;
import com.example.jddpbackend.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/dishes")
public class DishController {
    private final DishRepository dishRepository;

    @Autowired
    public DishController(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @PostMapping
    public ResponseEntity<String> createDish(@RequestBody DishEntity dish) {
        try {
            DishEntity savedDish = dishRepository.save(dish);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedDish.getDishId().toString());
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create dish");
        }
    }
}
