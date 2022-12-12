package productTypes;

import jakarta.persistence.Entity;

@Entity
public class RAMStick extends Product {
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
