package com.example.jddpbackend.repository;

import com.example.jddpbackend.entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface DishRepository extends JpaRepository<DishEntity, Long>{

}