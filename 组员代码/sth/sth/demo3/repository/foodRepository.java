package com.example.demo3.repository;
import com.example.demo3.entity.food;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface foodRepository extends CrudRepository<food, Long> {
    @Transactional
    @Modifying
    @Query(value = "select * from food", nativeQuery = true)
    List<food> findAll();

}

