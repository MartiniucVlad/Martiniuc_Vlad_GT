package com.example.demo.productTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CPUCooler extends Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
	
  int nrFans;

  public CPUCooler(String name, String brand, int price, int nrFans) {
    super(name, brand, price);
    this.nrFans = nrFans;
  }
}
