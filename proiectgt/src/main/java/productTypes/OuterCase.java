package productTypes;

import jakarta.persistence.Entity;

@Entity
public class OuterCase extends Product {
  private enum sizes {
    MEDIUM, BIG, SMALL
  }

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
