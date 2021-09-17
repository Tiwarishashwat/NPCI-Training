public class ElementOccurrences
{
  public static void main(String args[])
  {
      int arr[] = {2,7,84,4,5,5,9,0,-1,-8};
      System.out.println("The first Occurrence of "+5+" is "+firstOccurrence(arr,arr.length,5));
      System.out.println("All Occurrences of "+5+" are: ");
      allOccurrences(arr,arr.length,5);
  }
  public static int firstOccurrence(int arr[], int n, int target)
  {
    for(int i=0;i<n;i++)
    {
      if(arr[i]==target)
      {
        return i;
      }
    }
    return -1;
  }

  public static void allOccurrences(int arr[], int n, int target)
  {
    for(int i=0;i<n;i++)
    {
      if(arr[i]==target)
      {
        System.out.print(i+" ");
      }
    }
  }


}
