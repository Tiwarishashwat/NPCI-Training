import java.util.*;
public class Matrix{
  public static void main(String args[])
  {
    Scanner ob = new Scanner(System.in);
      int rows=0;
      int cols=0;
      System.out.println("Enter rows");
      rows=ob.nextInt();
      System.out.println("Enter columns");
      cols=ob.nextInt();
      int arr[][] = new int[rows][cols];
      Matrix mat = new Matrix();
      mat.buildMatrix(arr,rows,cols);
      mat.printMatrix(arr,rows,cols);
  }

  void printMatrix(int arr[][], int rows, int cols)
  {
      for(int i=0;i<rows;i++)
      {
        for(int j=0;j<cols;j++)
        {
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
  }

  void buildMatrix(int arr[][], int rows, int cols)
  {
    Scanner obj = new Scanner(System.in);
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<cols;j++)
      {
        System.out.println("Enter element");
        arr[i][j] = obj.nextInt();
      }
    }
  }
}
