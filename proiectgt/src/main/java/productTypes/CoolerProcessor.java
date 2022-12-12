package productTypes;

import jakarta.persistence.Entity;

@Entity
public class CoolerProcessor extends Product {
  int nrFans;

  public CoolerProcessor(String name, String brand, int price, int nrFans) {
    super(name, brand, price);
    this.nrFans = nrFans;
  }
}
