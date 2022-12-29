package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.productTypes.GraphicsCard;

@Repository
public interface GraphicsCardRepository extends CrudRepository<GraphicsCard, Long> {
}
