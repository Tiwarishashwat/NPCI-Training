import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
  public static void main(String args[]) throws Exception
  {
    Main object = new Main();
    object.startPageUI();
  }

  public static void displayLoan(Loan loan)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\t Hello and welcome to Loan Service");
    System.out.println("\t Please Enter your details");
    System.out.println("\t Enter your Name");
    String name = sc.nextLine();
    loan.setName(name);
    System.out.println("\t Enter your Age");
    int age = Integer.parseInt(sc.nextLine());
    loan.setAge(age);
    System.out.println("\t Choose your Income Group:");
    System.out.println("\t\t Press 1 for Low-Income Group");
    System.out.println("\t\t Press 2 for Middle-Income Group");
    System.out.println("\t\t Press 3 for Upper-Income Group");
    String incomeGroup = sc.nextLine();
    incomeGroup=incomeGroup.trim();
    if(!incomeGroup.equals("1") && !incomeGroup.equals("2") && !incomeGroup.equals("3")){
      System.out.println("\t\t Wrong Input!");
      return;
    }
    loan.setIncomeGroup(incomeGroup);
    System.out.println("\t Enter the Loan Amount");
    float loanAmount = sc.nextFloat();
    loan.setLoanAmount(loanAmount);
  }

  public void startPageUI() throws InterruptedException{
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
        Loan loan = new Loan();
        displayLoan(loan);
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
          System.out.println("\t Wrong input provided Please press either 1,2 or 3");
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
