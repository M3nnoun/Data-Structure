package DS;

public class LinkedStack <T>{
    public class Node {
        T item;
        Node next;

        public Node(T item) {
            this.item = item;
            this.next = null;
        }

        public Node(){
            this.item = (T) null;
            this.next = null;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }
    Node topElemnt=null;

    public LinkedStack() {
    }

    public void push(T item) {
        Node element =new Node(item);
        if (topElemnt == null) {
            topElemnt = element;
        } else {
            element.next = topElemnt;
            topElemnt = element;
        }
    }
    public void pop(){
        if(topElemnt==null)
            System.out.println("The stack is Empty...");
        else{
            topElemnt=topElemnt.next;
        }
    }

    public void pop(Node deleted){
        if(topElemnt==null)
            System.out.println("The stack is Empty...");
        else{
            deleted.setItem(topElemnt.getItem());
            System.out.println(">>>>" +deleted.item);
            topElemnt=topElemnt.next;
        }
    }

    public void showAll(){
        Node topPtr=this.topElemnt;
        while (topPtr!=null){
            System.out.println(topPtr.item);
            topPtr=topPtr.next;
        }
    }

    public T getTopElemnt() {
        return topElemnt.getItem();
    }

    public boolean isEmpthy(){return this.topElemnt==null;}

}
