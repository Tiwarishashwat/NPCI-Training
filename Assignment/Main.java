public class Main{
  public static void main(String args[])
  {

    Stack stack = new Stack(3);
       stack.push(1);
       stack.push(3);
       stack.push(2);

       stack.printStack();
       // remove
       stack.pop();

    Queue queue = new Queue(3);
           queue.enQueue(1);
           queue.enQueue(3);
           queue.enQueue(6);

           // remove
           queue.deQueue();

           queue.printQueue();
  }
}
