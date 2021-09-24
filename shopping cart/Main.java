import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner("System.in");
    char ch;
    int choice;
    int quan;
    String in;
    Items cloth   = new Cloth();
    Items watch   = new Watch();
    Items mobile  = new Mobile();

    ArrayList<Items> items = new ArrayList<>();

    items.add(cloth);
    items.add(watch);
    items.add(mobile);

    System.out.println("Our Products:");
    System.out.println("Name"+"\t"+"Price"+"\t"+"Quantity");
    for(int i=0;i<items.size();i++)
    {
      System.out.println(items.get(i).getName()+"\t"+items.get(i).getPrice()+"\t"+items.get(i).getQuantity());
    }
    System.out.println("Press Y to add an item to the cart");
    in = sc.nextLine();

    if(in.charAt(0)=='Y')
    {
      System.out.print("Press 1 for Cloth" + "\n" + "Press 2 for Watch" + "\n" + "Press 3 for Mobile" + "\n");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
              {
                    if(items.get(0).getQuantity()==0)
                    {
                        System.out.println("Out of Stock");
                    }
                    else
                    {
                      System.out.println("Enter Quantity");
                      quan = sc.nextInt();
                      if(quan<0 || quan > items.get(0).getQuantity())
                      {
                          System.out.println("Out of Stock");
                      }
                      else
                      {
                        items.get(0).sold(quan);
                        System.out.println("Sold!!");
                      }
                    }
                    break;
              }
        case 2:
        {
              if(items.get(1).getQuantity()==0)
              {
                  System.out.println("Out of Stock");
              }
              else
              {
                System.out.println("Enter Quantity");
                quan = sc.nextInt();
                if(quan<0 || quan > items.get(1).getQuantity())
                {
                    System.out.println("Out of Stock");
                }
                else
                {
                  items.get(1).sold(quan);
                  System.out.println("Sold!!");
                }
              }
              break;
        }
        case 3:
        {
              if(items.get(2).getQuantity()==0)
              {
                  System.out.println("Out of Stock");
              }
              else
              {
                System.out.println("Enter Quantity");
                quan = sc.nextInt();
                if(quan<0 || quan > items.get(2).getQuantity())
                {
                    System.out.println("Out of Stock");
                }
                else
                {
                  items.get(2).sold(quan);
                  System.out.println("Sold!!");
                }
              }
              break;
        }
      }
    }
    else
    {
      System.out.println("See you again!!");
    }
  }
}
