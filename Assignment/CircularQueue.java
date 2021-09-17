
public class CircularQueue {
    int size;
    int[] items;
    int front,rear;

    CircularQueue(int size){
        items = new int[size];
        front = -1;
        rear = -1;
    }

    void enQueue(int element){
        if (isFull() || rear==(front-1)%(size-1)){
            System.out.println("Queue is Full");
        }else{
          if(rear==size-1 && front!=0)
          {
            rear=-1;
          }
            if(front == -1){
                front = 0;
            }
            rear++;
            items[rear] = element;
        }
    }

    int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            element = items[front];
            if(front >= rear){
                front = -1;
                rear = -1;
            }
            else if(front==size-1)
            {
              front=0;
            }
            else{
                front++;
            }
            return element;
        }
    }

    boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(front == 0 && rear == size -1 ){
            return true;
        }
        return false;
    }

    void printQueue(){
        int i;
        if(!isEmpty()){
            for (i=front; i<=rear;i++){
                System.out.println(items[i]);
            }
        }
    }
}
