package DS;

import java.util.ArrayList;

public class Queue<T>{
    int front;
    int rear;
    int counter;
    T[] elements;
    int MAX_SIZE;

    public Queue(int size) {
        this.MAX_SIZE=size;
        this.front = 0;
        this.rear = size-1;
        this.elements =(T[]) new Object[size];
    }

    public boolean isEmpty(){
        return counter==0;
    }

    public boolean isFull(){
        return counter==MAX_SIZE;
    }

//    enqueue methode is INSERT
    private int getNewPossition(int index){
        return (index+1)%MAX_SIZE;
    }
    public void insert(T element){
        if(isFull()) System.out.println("The queue is FULL");
        else if (isEmpty()) {
            this.elements[this.front]=element;
            this.rear=0;
            this.counter++;
        } else {
            this.rear=getNewPossition(this.rear);
            this.elements[this.rear]=element;
            this.counter++;
        }
    }

//    delet from the queue
public void delete(){
    if(isEmpty()) System.out.println("The queue is empty");
    else {
        this.elements[this.front]=null;
        this.front=getNewPossition(this.front);
        this.counter--;
    }
}
public void printElements(){
    for (int i = 0; i < this.elements.length; i++) {
        System.out.println(this.elements[i]+" : "+i);
    }
    System.out.println("======Resume========");
    System.out.println("The index of the Head is: "+this.front+" => "+this.elements[front]);
    System.out.println("The index of the Tail is: "+this.rear+" => "+this.elements[rear]);
    System.out.println("Le nomber des elements is: "+this.counter);
    }

}

