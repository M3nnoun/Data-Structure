package DS;

public class LinkedQueue {
    Node tail;
    Node front;
    int length;

    public LinkedQueue(Node tail, Node front, int length) {
        this.tail = tail;
        this.front = front;
        this.length = length;
    }

    public LinkedQueue() {
        this.tail = null;
        this.front = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void enqueue(Node element) {
        if (isEmpty()) {
            // Both front and tail should point to the first element
            this.front = element;
            this.tail = element;
        } else {
            // Add the new element at the end and update the tail
            this.tail.next = element;
            this.tail = element;
        }
        length++;
    }

    public void printElements() {
        Node currentNode = this.front;
        while (currentNode != null) {
            System.out.println(currentNode.item);
            currentNode = currentNode.next;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The Queue is EMPTY");
        } else if (this.front==null) {
            this.tail=null;
            length=0;
        } else {
            // Add the new element at the end and update the tail
            this.front = this.front.next;
            length--;
        }
    }
    /**
     * A function To get the TOP Element in Queue
     */
    public int peek(){
        return front.getItem();
    }
}
