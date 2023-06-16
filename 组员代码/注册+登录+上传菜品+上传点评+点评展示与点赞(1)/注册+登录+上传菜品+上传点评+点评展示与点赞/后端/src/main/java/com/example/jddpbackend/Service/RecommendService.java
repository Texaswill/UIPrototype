package com.example.jddpbackend.Service;
import com.example.jddpbackend.repository.RecommendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.jddpbackend.entity.DishEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RecommendService {

    private RecommendRepository recommendRepository;
    public double calculateCos(DishEntity food1,DishEntity food2){
        double[] feature1,feature2;
        feature1=new double[4];
        feature2=new double[4];
        feature1[0]=food1.getLocation()*100.0/9;
        feature2[0]=food2.getLocation()*100.0/9;
        feature1[1]=food1.getPrice()*100.0/40;
        feature2[1]=food2.getPrice()*100.0/40;
        feature1[2]=food1.getTaste()*100.0/5;
        feature2[2]=food2.getTaste()*100.0/5;
        feature1[3]=food1.getType()*100.0/6;
        feature2[3]=food2.getType()*100.0/6;
        double upper=0;
        double lower1=0;
        double lower2=0;
        for (int i = 0; i < 4; i++) {
            upper+=feature1[i]*feature2[i];
            lower1+=feature1[i]*feature1[i];
            lower2+=feature2[i]*feature2[i];
        }
        return upper/Math.sqrt(lower1*lower2);

    }

    public List<DishEntity> getRecommend(DishEntity food){
        List<DishEntity>all=recommendRepository.findAll();
        for (int i = 0; i < all.size(); i++) {
            all.get(i).setCos(calculateCos(food,all.get(i)));
        }
        all.sort(Comparator.comparing(com.example.jddpbackend.entity.DishEntity::getCos).reversed());
        List<DishEntity> recommend=new ArrayList<>();
        for (int i = 0; i < 5 && i < all.size(); i++) {
            recommend.add(all.get(i));
        }
        return recommend;

    }
}


