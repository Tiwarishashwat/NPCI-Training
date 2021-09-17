public class StackQueue
{
  public static void main(String args[])
  {
    Stack stack = new Stack(7);
    stack.push(6);
    stack.push(12);
    stack.push(2);
    stack.push(15);
    stack.push(17);
    stack.push(3);
    stack.push(9);



    Queue queue = new Queue(7);

    int arr[]=findSmallestTwo(stack);
    pushToQueue(stack,queue,arr);
    queue.printQueue();

  }

  public static int[] findSmallestTwo(Stack stack)
  {
    Stack tempStack = new Stack(stack.size());
    int temp1=Integer.MAX_VALUE;
    int temp2=Integer.MAX_VALUE;
    int size=stack.size();
    for(int i=0;i<size;i++)
    {
      int temp=stack.pop();
      if(temp1>temp)
      {
        temp2=temp1;
        temp1=temp;
      }
      if(temp<temp2 && temp>temp1) temp2=temp;
      tempStack.push(temp);
    }

    // push back
    for(int i=0;i<size;i++)
    {
      stack.push(tempStack.pop());
    }


    int arr[] = new int[2];
    arr[0] = temp1;
    arr[1] = temp2;

    return arr;
  }

  public static void pushToQueue(Stack tempStack, Queue queue, int arr[])
  {
    Stack stack = new Stack(tempStack.size());

    // reverse
    for(int k=0;k<7;k++)
    {
      stack.push(tempStack.pop());
    }

    for(int i=0;i<arr.length;i++)
    {
      int element = arr[i];
      int size=stack.size();
      for(int j=0;j<size;j++)
      {
        int temp=stack.pop();
        if(temp%element==0 && element!=temp)
        {
          queue.enQueue(temp);
        }
        tempStack.push(temp);
      }
      // push back
      for(int k=0;k<size;k++)
      {
        stack.push(tempStack.pop());
      }
    }
  }

}
