package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.productTypes.Motherboard;

@Repository
public interface MotherboardRepository extends CrudRepository<Motherboard, Long> {
}
