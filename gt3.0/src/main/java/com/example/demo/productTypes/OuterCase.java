package com.example.demo.productTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OuterCase extends Product  {
  private enum sizes {
    MEDIUM, BIG, SMALL
  }
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  sizes CaseType;
  int nrFans;
  int nrFanSlots;

  public OuterCase(String name, String brand, int price, sizes caseType, int nrFans,
      int nrFanSlots) {
    super(name, brand, price);
    CaseType = caseType;
    this.nrFans = nrFans;
    this.nrFanSlots = nrFanSlots;
  }

}
