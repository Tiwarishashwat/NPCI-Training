import java.util.*;
public class DigitSquareMultiple{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    int num;
    System.out.println("Enter the Number");
    num=obj.nextInt();

    // special case
    if(num==1)
    {
      System.out.println(num);
      return;
    }

    // utility variables
      int digits=0;
      String n="";
      n+=num;
    // calculating number of digits
      digits=n.length();

      // print the digits
    System.out.println("Number of digits are: "+digits);

    // even
    if(digits%2==0)
    {
      System.out.println("result: "+digits+" , "+digits*digits);
    }

    // 3's multiple
    else if(digits%3==0)
    {
      System.out.println("result: "+digits+ "," +digits*digits*digits);
    }

    else
    {
      int temp=digits;
      while(digits%2!=0)
      {
        digits--;
      }
      System.out.println("result: "+temp+"["+digits+"]"+" , "+digits*digits);
    }

  }
}
