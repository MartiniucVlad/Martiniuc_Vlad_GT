package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.productTypes.CPUCooler;

@Repository
public interface CPUCoolerRepository extends CrudRepository<CPUCooler, Long> {
}
