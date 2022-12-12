package productTypes;

import jakarta.persistence.Entity;

@Entity
public class GraphicsCard extends Product {
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
