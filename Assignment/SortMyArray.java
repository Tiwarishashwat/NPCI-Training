public class SortMyArray
{
  public static void main(String args[])
  {
    int arr[] = {2,7,84,4,5,5,9,0,-1,-8};
    sortIt(arr,arr.length);
    display(arr);
  }
  public static void display(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
  public static void sortIt(int arr[],int n)
  {
    // outer loop
    for(int i=0;i<n;i++)
    {
      // variable to check if array is sorted then break the loop
      int flag=0;
      // comparisions
      for(int j=0;j<n-i-1;j++)
      {
        // swaping
        if(arr[j]>arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          flag=1;
        }
      }
      if(flag==0)
      {
        break;
      }
    }
  }
}
