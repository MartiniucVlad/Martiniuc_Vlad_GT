package com.example.demo.productTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class RAMStick extends Product {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  long id;
	
  int memorySize;
  int speedMHz;
  String memoryType;

  public RAMStick(String name, String brand, int price, int memorySize, int speedMHz,
      String memoryType) {
    super(name, brand, price);
    this.memorySize = memorySize;
    this.speedMHz = speedMHz;
    this.memoryType = memoryType;
  }



}
