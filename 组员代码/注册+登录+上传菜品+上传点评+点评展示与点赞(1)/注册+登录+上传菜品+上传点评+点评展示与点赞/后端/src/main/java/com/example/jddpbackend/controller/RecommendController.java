package com.example.jddpbackend.controller;
import com.example.jddpbackend.repository.RecommendRepository;
import com.example.jddpbackend.Service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jddpbackend.entity.DishEntity;
import java.util.List;
public class RecommendController {
    @Autowired
    private  RecommendRepository foodRepository;
    private DishEntity me;
    private RecommendService recommendService;
    @RequestMapping("/getFood")
    List<DishEntity> getFood(){
        List<DishEntity> result;
        result = foodRepository.findAll();
        return result;
    }
    @RequestMapping("/cardListData")
    List<DishEntity> getRecommend(){

        return recommendService.getRecommend(me);
    }

    RecommendController(){
        me=new DishEntity();
        me.setLocation(1);
        me.setPrice(15);
        me.setTaste(2);
        me.setType(3);
        recommendService=new RecommendService();
    }
}
