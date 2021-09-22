import java.util.*;
public class Occurance  {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
  int n = obj.nextInt();
  int arr[] = new int[n];

  for(int i=0;i<n;i++)
  {
    arr[i] = obj.nextInt();
  }
    stepOne(arr);

    System.out.println();

    stepTwo(arr);

    System.out.println();

    stepThree(arr);
  }

  public static void stepOne(int arr[])
  {
    sortArray(arr,false);
    printArray(arr);
  }

  public static void stepTwo(int arr[])
  {
      sortArray(arr,true);
      printArray(arr);
  }

  public static void stepThree(int arr[])
  {

  }

  public static void printArray(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      if(i!=arr.length-1 && arr[i]==arr[i+1])
      {
        System.out.print(arr[i]+",");
      }
      else
      {
        System.out.print(arr[i]);
        if(i!=arr.length-1)
        {
          System.out.print(",");
            System.out.print(" ");
        }
      }
    }

  }

  public static void sortArray(int arr[], boolean dec)
  {
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr.length-i-1;j++)
      {
        if(dec==true)
        {
            if(arr[j]<arr[j+1])
            {
              int temp = arr[j+1];
              arr[j+1] = arr[j];
              arr[j] = temp;
            }
        }
        else
        {
            if(arr[j]>arr[j+1])
            {
              int temp = arr[j+1];
              arr[j+1] = arr[j];
              arr[j] = temp;
            }
        }
      }
    }
  }

}
