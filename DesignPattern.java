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
