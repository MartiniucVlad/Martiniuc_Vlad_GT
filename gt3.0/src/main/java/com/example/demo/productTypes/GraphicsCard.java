package com.example.demo.productTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class GraphicsCard extends Product {
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  int VRAMSize;
  String memoryType;
  int nrFans;
  int memoryBusSize;

  public GraphicsCard(String name, String brand, int price, int vRAMSize, String memoryType,
      int memoryBusSize, int nrFans) {
    super(name, brand, price);
    VRAMSize = vRAMSize;
    this.memoryType = memoryType;
    this.nrFans = nrFans;
    this.memoryBusSize = memoryBusSize;
  }



}
