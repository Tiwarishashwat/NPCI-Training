import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
  public static void main(String args[]) throws Exception
  {
    Main object = new Main();
    object.startPageUI();
  }

  public static boolean isEligible(EMICalculator emiCalculator)
  {
    float income = emiCalculator.getIncome();
    float expenses = emiCalculator.getExpenses();
    String loanType = emiCalculator.getLoanType();
    boolean existingEMI = emiCalculator.getExistingEMI();
    float amountEMI = 0;
    float loanAmount = emiCalculator.getLoanAmount();
    if(existingEMI) emiCalculator.getAmountEMI();
    float totalExpense = expenses + amountEMI;
    float balance = (float)((0.7)*income - totalExpense);
    if(balance>0)
    {
      if(loanType.equals("Car Loan"))
      {
        if(balance > loanAmount/48) return true;
      }
      else
      {
        if(balance > loanAmount/24) return true;
      }
    }
    return false;
  }

  public static void displayLoanMenu(Loan loan)
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

  public static void displayEMICalculatorMenu(EMICalculator emiCalculator)
  {
    Scanner sc = new Scanner(System.in);
    String leftOver;
    System.out.println("\t EMI Calculator");
    System.out.println("\t Enter your Loan Type");
    System.out.println("\t\t Press 1 for Car Insurance");
    System.out.println("\t\t Press 2 for Home Insurance");
    String input1 = sc.nextLine();
    if(!input1.equals("1") && !input1.equals("2")){
      System.out.println("\t\t Wrong Input!");
      return;
    }
    String loanType;
    if(input1.equals("1")) loanType = "Car Loan";
    else loanType = "House Loan";

    emiCalculator.setLoanType(loanType);

    System.out.println("\t Enter your Income");
    float income = sc.nextFloat();
    leftOver = sc.nextLine();
    emiCalculator.setIncome(income);

    System.out.println("\t Enter your Expenses");
    float expenses = sc.nextFloat();
    leftOver = sc.nextLine();
    emiCalculator.setExpenses(expenses);

    System.out.println("\t Do you have an Active Loan?");
    System.out.println("\t\t Press 1 for True");
    System.out.println("\t\t Press 2 for False");
    String ans = sc.nextLine();

    if(!ans.equals("1") && !ans.equals("2")){
      System.out.println("\t\t Wrong Input!");
      return;
    }
    boolean existingEMI = (ans.equals("1"))?true:false;
    emiCalculator.setExistingEMI(existingEMI);

    if(existingEMI)
    {
          System.out.println("\t Enter your EMI Amount");
          float amountEMI = sc.nextFloat();
          emiCalculator.setAmountEMI(amountEMI);
          leftOver = sc.nextLine();
    }
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
        EMICalculator loan = new EMICalculator();
        displayLoanMenu(loan);
        displayEMICalculatorMenu(loan);
        if(isEligible(loan))
        {
          System.out.println("Your Loan is approved");
        }
        else
        {
          System.out.println("Sorry you are not eligible for this loan");
        }
          // Customer.add(loan);
      }

      else if(choice.charAt(0)=='2')
      {
          EMICalculator emiCalculator = new EMICalculator();
          displayEMICalculatorMenu(emiCalculator);
          if(isEligible(emiCalculator))
          {
            System.out.println("Your Loan is approved");
          }
          else
          {
            System.out.println("Sorry you are not eligible for this loan");
          }
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
