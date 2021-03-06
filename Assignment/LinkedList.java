public class LinkedList {

    Node head=null;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void insertAtFront(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insert(Node prev,int data){
        if(prev == null){
            return;
        }
        Node node = new Node(data);
        node.next = prev.next;
        prev.next = node;
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head = new Node(data);
            return;
        }
        node.next = null;
        Node last = head;

        while (last.next !=null){
            last = last.next;
            last.next = node;
            return;
        }
    }
    boolean search(Node head,int key){
        Node current = head;
        while(current !=null){
            if (current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void delete(int position){
        if(head == null){
            return;
        }
        Node temp = head;
        if(position == 0){
            head = temp.next;
            return;
        }
        //
        for(int i=0;temp !=null && i< position -1 ;i++) {
            temp = temp.next;
        }
        // if key is not present
        if(temp == null || temp.next == null){
            return;
        }
        // remove the node;
        Node next = temp.next.next;
        temp.next = next;
    }

    public void printList(){
        Node head = this.head;

        while (head !=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public void sortList() {
        //Node current will point to head
        Node current = head, index = null;  
        int temp;

        if(head == null) {
            return;
        }
        else {
            while(current != null) {
                //Node index will point to node next to current
                index = current.next;

                while(index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }


}
