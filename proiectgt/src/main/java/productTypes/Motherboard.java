package productTypes;

import jakarta.persistence.Entity;

@Entity
public class Motherboard extends Product {
  String compatibleBrand;
  String nrRAMSockets;

  public Motherboard(String name, String brand, int price, String compatibleBrand,
      String nrRAMSockets) {
    super(name, brand, price);
    this.compatibleBrand = compatibleBrand;
    this.nrRAMSockets = nrRAMSockets;
  }
}
