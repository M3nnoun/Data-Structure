import DS.Queue;

public class MainQueue {
    public static void main(String[] arg){
        Queue<Integer> firstQueue =new Queue<>(10);
        firstQueue.insert(10);
        firstQueue.insert(20);
        firstQueue.insert(30);
        firstQueue.insert(40);
        firstQueue.insert(50);
        firstQueue.insert(60);
        firstQueue.insert(70);

        firstQueue.printElements();
        firstQueue.delete();
        firstQueue.delete();
        firstQueue.delete();
        firstQueue.delete();
        firstQueue.delete();
        firstQueue.delete();
        firstQueue.delete();
        firstQueue.printElements();
    }
}
