public class Main{
  public static void main(String args[])
  {

    // Stack stack = new Stack(3);
    //    stack.push(1);
    //    stack.push(3);
    //    stack.push(2);
    //
    //    stack.printStack();
    //    // remove
    //    stack.pop();
    //
    Queue queue = new Queue(4);
    //        queue.enQueue(1);
    //        queue.enQueue(3);
    //        queue.enQueue(6);
    //
    //        // remove
    //        queue.deQueue();
    //
    //        queue.printQueue();
           // Linked List

                  LinkedList linkedList = new LinkedList();
                  linkedList.insertAtEnd(1);
                  linkedList.insertAtFront(3);
                  linkedList.insertAtFront(10);
                  linkedList.insertAtFront(9);
                  linkedList.sortList();
                  linkedList.printList();

                  while(linkedList.head!=null)
                  {
                    queue.enQueue(linkedList.head.data);
                    linkedList.head=linkedList.head.next;
                  }

                  queue.printQueue();

  }
}
