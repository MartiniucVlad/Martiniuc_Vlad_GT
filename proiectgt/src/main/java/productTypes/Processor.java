package productTypes;

import jakarta.persistence.Entity;

@Entity
public class Processor extends Product {
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
