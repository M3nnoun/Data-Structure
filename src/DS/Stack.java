package DS;

public class Stack<T> {
int top;
T[] elements;
int MAX_SIZE;

    public Stack(int size) {
        this.top = -1;
        this.elements = (T[]) new Object[size];
        this.MAX_SIZE=size;
    }

    public void push(T element){
        if(top<this.MAX_SIZE-1){
            top++;
            this.elements[top]=element;
        }else{
            System.out.println("The stack is Full");
        }
    }

    public T pop(){
        if(!this.isEmpty()){
            T deleted= this.elements[top];
            top--;
            return  deleted;
        }

        return null;
    }

    public void remove(){
        if(this.isEmpty())
            System.out.println("The stack is empty");
        else
            top--;
    }

    public int getTop() {
        return top;
    }

    public boolean isEmpty(){
        return this.top==-1;
    }

    public void printElements(){
        System.out.println("printing all Elemnt on the stack");
        for (int i = top; i >-1; i--) {
            System.out.println(this.elements[i]);
        }
        System.out.println("---------------------------------");
    }

    public T getTopElement(){
        return this.elements[top];
    }
}

