public class Items
{
  private String name;
  private float price;
  private int quantity;
  String getName()
  {
    return this.name;
  }
  float getPrice()
  {
    return this.price;
  }
  int getQuantity()
  {
    return this.quantity;
  }
  void sold(int quantity)
  {
    this.quantity -= quantity;
  }
}

class Cloth extends Items
{
  private float price=100;
  private int quantity=10;
  String getName()
  {
    return "Cloth";
  }
  float getPrice()
  {
    return this.price;
  }
  int getQuantity()
  {
    return this.quantity;
  }
  void sold(int quantity)
  {
    this.quantity -= quantity;
  }
}

class Watch extends Items
{
  private float price=200;
  private int quantity=5;
  String getName()
  {
    return "Watch";
  }
  float getPrice()
  {
    return this.price;
  }
  int getQuantity()
  {
    return this.quantity;
  }
  void sold(int quantity)
  {
    this.quantity -= quantity;
  }
}

class Mobile extends Items
{
  private float price=300;
  private int quantity=3;
  String getName()
  {
    return "Mobile";
  }
  float getPrice()
  {
    return this.price;
  }
  int getQuantity()
  {
    return this.quantity;
  }
  void sold(int quantity)
  {
    this.quantity -= quantity;
  }
}
