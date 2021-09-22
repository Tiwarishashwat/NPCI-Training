public class mergeSort{
  public static void main(String[] args) {

  }
  void MergeSort(int arr[], int start, int end)
  {
    if(start<end)
    {
      int mid = start + (end-start)/2;
      MergeSort(arr,start,mid);
      MergeSort(arr,mid+1,end);
      merge(arr,start,mid,end);
    }
  }
  void merge(int arr[], int start,int mid, int end)
  {
    int s1=mid-start+1;
    int s2=end-mid;
    int t1[] = new int[s1];
    int t2[] = new int[s2];

    for(int i=0;i<s1;i++)
    {
      t1[i] = arr[start+i];
    }
    for(int j=0;j<s2;j++)
    {
      t1[j] = arr[mid+j+1];
    }

    while()

  }
}
