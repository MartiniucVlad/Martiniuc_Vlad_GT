package com.example.demo.productTypes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Product {


  int price;
  String name;
  String brand;

  public Product(String name, String brand, int price) {
	  
	  
    this.name = name;
    this.brand = brand;
    this.price = price;
  }



}
