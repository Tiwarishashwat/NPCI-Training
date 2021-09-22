import java.util.*;
public class Tower{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
      int rows=0;
      int num=0;
      System.out.println("Enter rows");
      rows=ob.nextInt();
      System.out.println("Enter num");
      num=ob.nextInt();
      int arr[] = new int[rows];
      Tower tow = new Tower();
      int sum=num;
      for(int i=0;i<rows;i++)
      {
        int rowSum = 0;
        for(int j=0;j<=i;j++)
        {
          rowSum = rowSum + sum;
        }
        arr[i] = sum;
        sum = sum + rowSum;

      }
      tow.printTower(arr,rows);
  }

  void printTower(int arr[],int n)
  {
    for (int i=0; i<n; i++)
       {
          int val = arr[i];
           // inner loop to handle number spaces
           // values changing acc. to requirement
           for (int j=n-i; j>1; j--)
           {
               // printing spaces
               System.out.print(" ");
           }

           //  inner loop to handle number of columns
           //  values changing acc. to outer loop
           for (int j=0; j<=i; j++ )
           {
               // printing stars
               System.out.print(val+" ");
           }

           // ending line after each row
           System.out.println();
       }
  }
}
