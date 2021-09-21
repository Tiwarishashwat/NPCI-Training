import java.util.*;
public class SquareAndMultiple{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    int val1;
    int val2;
    System.out.println("Enter First Number");
    val1=obj.nextInt();
    System.out.println("Enter Second Number");
    val2=obj.nextInt();

    if(val2%2==0)
    {
      // even
      if(val1*val1==val2)
      {
        // square
        if(val2%val1==0)
        {
          // multiple
          System.out.println(val2 +"is a square and multiple of" + val1);
        }
      }
      else if(val2%val1==0)
        {
          System.out.println(val2 +"is a multiple of " + val1 + " and "+ val1 +" is "+ val2/val1 + " of " + val2);
        }
      else
      {
        System.out.println("Neither a square nor a multiple");
      }
    }
      else
      {
          System.out.println("Not an even number");
      }
  }
}
