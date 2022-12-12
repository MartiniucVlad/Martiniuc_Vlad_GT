package productTypes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  int price;
  String name;
  String brand;

  public Product(String name, String brand, int price) {
    this.name = name;
    this.brand = brand;
    this.price = price;
  }



}
