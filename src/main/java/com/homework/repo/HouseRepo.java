package com.homework.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homework.entity.House;

@Repository

public interface HouseRepo extends JpaRepository<House, Integer> {
    
}
