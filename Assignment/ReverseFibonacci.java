import java.util.*;
public class ReverseFibonacci{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n;
    System.out.print("Enter a number");
    n=obj.nextInt();
    int arr[] = new int[n];
    arr[0] = 0;
    arr[1] = 1;

    for(int i=2;i<n;i++)
    {
      arr[i] = arr[i-1] + arr[i-2];
    }

    for(int i=n-1;i>=0;i--)
    {
      System.out.println(arr[i]);
    }
  }
}
