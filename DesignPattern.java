// Design Pattern
/*
Creational (object creation)
  // Singleton -> one object, global example Runtime
  // Factory
  // Abstarct Factory
  // Prototype

Structural (creating large object from smaller object)
// Adapter
// Composite
// Proxy
// Flyweight
// Facade
// Bridge
// Decorator

Behavioral (Service creation)
// Template Method
// Mediator
// Chain of Responsibility
// Observer
// Strategy
// command
// state
*/

// Singleton

public class Singleton
{
  // Eager Initialization -> pre initialized
  private static Singleton singleton = new Singleton();
  public static Singleton getInstance(){
    return singleton;
  }
    private Singleton(){
    }
    // other approach
    // Lazy Initialization
    private static Singleton singleton;
    public static Singleton getInstance(){
      if(singleton==null)
      {
        singleton = new Singleton();
      }
      return singleton;
    }
// in case of threads!
    private static Singleton singleton;
    public static synchronized Singleton getInstance(){
      if(singleton==null)
      {
        singleton = new Singleton();
      }
      return singleton;
    }

}

// Factory

public abstarct class Vehicle{
  abstract int getRPm();
  abstract String getTyreInfo();
  public void Display()
  {
    this.getRPm();
    this.getTyreInfo();
  }
}

public class VehicleFactory{
  public static getVehicle(String vehicleType)
  {
    if("CAR".equals(vehicleType))
    {
      return new Car();
    }
    else
    {
      return new Bike();
    }
  }
}

//new

public class Customer
{
  private int id;
  private String name;
  private String email;
  private int phoneNo;

  public int getId(){
    return id;
  }

  public int getName(){
    return name;
  }

  public int getEmail(){
    return email;
  }

  public int getPhoneNo(){
    return phoneNo;
  }

private Customer(CustomerBuilder builder)
{
  this.id=builder.id;
  this.name=builder.name;
  this.email=builder.email;
  this.phoneNo=builder.phoneNo;
}

  static class CustomerBuilder {

    private int id;
    private String name;
    private String email;
    private int phoneNo;

    public CustomerBuilder setId(int id)
    {
      this.id=id;
      return this;
    }

    public CustomerBuilder setName(String name)
    {
      this.name=name;
      return this;
    }

    public CustomerBuilder setEmail(String email)
    {
      this.email=email;
      return this;
    }

    public CustomerBuilder setPhoneNo(int phoneNo)
    {
      this.phoneNo=phoneNo;
      return this;
    }

    public Customer build()
    {
      return new Customer(this);
    }
    //to be performed in main method!
Customer customer = new Customer
                    .CustomerBuilder()
                    .setEmail("x@y.com")
                    .setName("shashwat")
                    .setId(37)
                    .setPhoneNo(7703456780)
                    .build();
  }
}
