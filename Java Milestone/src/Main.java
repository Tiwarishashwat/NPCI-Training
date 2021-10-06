import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
  public static void main(String args[]) throws Exception
  {
    Main object = new Main();
    object.startPage();
  }

  public void startPage() throws InterruptedException{
    Scanner sc = new Scanner(System.in);
    while(true)
    {
      System.out.println("\t\t\t\t Welcome to Loan and EMI Calculator");
      System.out.println("\t\t\t\t --------------------------------- ");
      System.out.println("\t Welcome to Main Menu");
      System.out.println("\t 1.Loan");
      System.out.println("\t 2.EMI Calculator based on loan");
      System.out.println("\t 3.Exit");
      System.out.println();
      Thread.sleep(1000);
      System.out.println("\t Enter your choice?");
      String choice;
      choice = sc.nextLine();

      if(choice.charAt(0)=='1')
      {
        System.out.println("\t Option 1");
      }

      else if(choice.charAt(0)=='2')
      {
          System.out.println("\t Option 2");
      }

      else if(choice.charAt(0)=='3')
      {
        System.out.println("\t We hate you for making this Bye so painful. Comeback soon!");
        System.exit(0);
      }

      else
      {
          System.out.println("\t Please press either 1,2 or 3, Dikhta nhi hai kya bc!");
      }
      try
      {
        Thread.sleep(5);
      }
      catch (Exception e)
      {
        System.out.println("\t Sorry your System just ran into a problem");
        System.out.print("\t Rebooting");
        for(int i=0;i<5;i++)
        {
          System.out.print(".");
          Thread.sleep(500);
        }
        System.out.println();
      }
    }

  }
}
