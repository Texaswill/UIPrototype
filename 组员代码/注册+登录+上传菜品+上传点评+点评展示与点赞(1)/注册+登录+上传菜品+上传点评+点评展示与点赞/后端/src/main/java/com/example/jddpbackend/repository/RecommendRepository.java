package com.example.jddpbackend.repository;
import com.example.jddpbackend.entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

public interface RecommendRepository  extends JpaRepository<DishEntity, Long>{
    @Transactional
    @Modifying
    @Query(value = "select * from dish", nativeQuery = true)
    List<DishEntity> findAll();
}
