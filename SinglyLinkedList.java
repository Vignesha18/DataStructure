import java.util.*;
import java.lang.*;
public class LinkedList{
    private Node head;
    private static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public LinkedList(){
        this.head=null;
    }
    public void add(int d){
        Node newNode=new Node(d);
        if(head==null){
            head=newNode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=newNode;
        }
    }
    public void delete(int value){
        if(head.data==value)
        {
            head=head.next;
            System.out.println("Head Node deleted");
        }
        else{
            Node current=head;
            while(current.next!=null && current.next.data!=value){
                current=current.next;
            }
            current.next=current.next.next;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public static void main(String[] args){
        LinkedList Li=new LinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the element:");
            int x=sc.nextInt();
            Li.add(x);
        }
        Li.display();
        System.out.println("Enter the elements to delete:");
        int d=sc.nextInt();
        Li.delete(d);
        Li.display();
    }
}
