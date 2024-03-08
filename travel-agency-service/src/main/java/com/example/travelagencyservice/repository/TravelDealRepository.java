package com.example.travelagencyservice.repository;


import com.example.travelagencyservice.model.TravelDeal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TravelDealRepository extends MongoRepository<TravelDeal, String> {

    public List<TravelDeal> findByDestination(String destination);

}