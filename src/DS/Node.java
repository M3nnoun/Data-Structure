package DS;

public class Node{
    int item;
    Node next;

    public Node(int item) {
        this.item = item;
        this.next = null;
    }

    public Node(){
        this.item = 0;
        this.next = null;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }
}
