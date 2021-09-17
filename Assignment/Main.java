public class Main{
  public static void main(String args[])
  {
    Queue queue = new Queue(3);
           queue.enQueue(1);
           queue.enQueue(3);
           queue.enQueue(6);

           // remove
           queue.deQueue();

           queue.printQueue();
  }
}
