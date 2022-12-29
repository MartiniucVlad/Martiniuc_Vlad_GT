package com.example.demo.productTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Processor extends Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
	  
  int speedGHz;
  int nrCores;
  int nrThreads;

  public Processor(String name, String brand, int price, int speedGHz, int nrCores, int nrThreads) {
    super(name, brand, price);
    this.speedGHz = speedGHz;
    this.nrCores = nrCores;
    this.nrThreads = nrThreads;
  }
}
