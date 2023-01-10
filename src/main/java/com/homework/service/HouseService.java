package com.homework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.entity.House;
import com.homework.repo.HouseRepo;

@Service

public class HouseService {

    @Autowired
    HouseRepo houseRepo;

    public House createHouse(House house){
        return houseRepo.save(house);
    }
    public List<House>viewAllHouse(){
        return houseRepo.findAll();
    }
    public House getByHouseId(Integer id){
        return houseRepo.findById(id).get();
    }
    public House changHouse(House house) throws Exception{
        if(house.getId() == null){
            throw new Exception("House not found!");
        }
        return houseRepo.save(house);
    }
    public void deleteByHouseId(Integer id){
        houseRepo.deleteById(id);
    }

    
}
