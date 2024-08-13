import DS.LinkedQueue;
import DS.Node;
import DS.Queue;

public class MainQueue {
    public static void main(String[] arg){
        Queue<Integer> firstQueue =new Queue<>(10);
//        firstQueue.insert(10);
//        firstQueue.insert(20);
//        firstQueue.insert(30);
//        firstQueue.insert(40);
//        firstQueue.insert(50);
//        firstQueue.insert(60);
//        firstQueue.insert(70);
//
//        firstQueue.printElements();
//        firstQueue.delete();
//        firstQueue.delete();
//        firstQueue.delete();
//        firstQueue.delete();
//        firstQueue.delete();
//        firstQueue.printElements();
//
        LinkedQueue secondeQueue=new LinkedQueue();
        secondeQueue.enqueue(new Node(10));
        secondeQueue.enqueue(new Node(20));
        secondeQueue.enqueue(new Node(30));
        secondeQueue.enqueue(new Node(40));
        secondeQueue.dequeue();
        secondeQueue.dequeue();
        secondeQueue.dequeue();
        secondeQueue.printElements();

        System.out.println(secondeQueue.peek());

    }
}
