import java.util.*;
class Main {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Main(){
        this.head=null;
    }
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    void delete(int value){
        if(head.data==value){
            head=head.next;
            head.prev=null;
        }
        else if(tail.data==value){
            tail=tail.prev;
            tail.next=null;
        }
        else{
            Node current=head;
            while(current.next!=null && current.next.data!=value){
                current=current.next;
            }
            current.next=current.next.next;
            current.next.prev=current;
        }
    }
    void display(){
        if(head==null){
            System.out.println("Empty");
        }
        else{
            Node current=tail;
            while(current!=null){
                System.out.println(current.data);
                current=current.prev;
            }
        }
    }

    public static void main(String[] args) {
        Main m1=new Main();
        m1.insert(10);
        m1.insert(30);
        m1.insert(40);
        m1.insert(50);
        m1.insert(70);
        m1.display();
        System.out.println("After");
        m1.delete(40);
        m1.display();
       
        
    }
}
