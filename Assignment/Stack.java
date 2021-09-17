public class Stack
{
  private int arr[];
  private int capacity;
  private int top;

  public Stack(int length)
  {
    if(length>0)
    {
      this.arr = new int[length];
      this.top = -1;
      this.capacity = length;
    }
  }

  public boolean isFull()
  {
    return top==capacity-1;
  }

  public boolean isEmpty()
  {
    return top==-1;
  }

  public int size()
  {
    return top+1;
  }

  public void push(int element)
  {
    if(!isFull())
    {
      arr[++top]=element;
    }
  }

  public int pop()
  {
    if(isEmpty())
    {
      System.exit(1);
    }
    return arr[top--];
  }

  public int peek()
  {
    if(!isEmpty())
    {
      return arr[top];
    }
    return -1;
  }

  public void printStack(){
       for (int i = 0; i <=top; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


}
