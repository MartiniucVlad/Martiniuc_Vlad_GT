package com.example.demo.productTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Motherboard extends Product {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	
  String compatibleBrand;
  String nrRAMSockets;

  public Motherboard(String name, String brand, int price, String compatibleBrand,
      String nrRAMSockets) {
    super(name, brand, price);
    this.compatibleBrand = compatibleBrand;
    this.nrRAMSockets = nrRAMSockets;
  }
}
