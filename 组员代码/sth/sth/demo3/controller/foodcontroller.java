package com.example.demo3.controller;
import com.example.demo3.repository.foodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.example.demo3.entity.food;
import com.example.demo3.service.foodService;
@RestController
@CrossOrigin
public class foodcontroller {
    @Autowired
    private  foodRepository foodRepository;
    private food me;
    private final foodService foodService;
    @RequestMapping("/getFood")
    List<food> getFood(){
        List<food> result;

        result = foodRepository.findAll();

        return result;
    }
    @RequestMapping("/getRecommend")
    List<food> getRecommend(){

        return foodService.getRecommend(me);
    }

    @RequestMapping("/addFood")
    void addFood(String name,int price,int type,int hot,int location){
        food food=new food();
        food.setName(name);
        food.setPrice(price);
        food.setType(type);
        food.setHot(hot);
        food.setLocation(location);
    }
    foodcontroller(){
        me=new food();
        me.setLocation(1);
        me.setPrice(15);
        me.setTaste(2);
        me.setType(3);
        foodService=new foodService();
    }
}
