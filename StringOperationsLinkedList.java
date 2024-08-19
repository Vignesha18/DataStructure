import java.util.*;
class Main{
    Node head;
    Node tail;
    class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Main(){
        this.head=null;
        this.tail=null;
    }
    void insert(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
        }
    }
    void delete(String val){
        if(head.data==val){
            head=head.next;
        }
        else if(tail.data==val){
            tail=tail.prev;
        }
        else{
            Node current=head;
            while(current.next!=null && !current.next.data.equals(val)){
                current=current.next;
            }
            current.next=current.next.next;
	      current.next.prev=current;
        }
    }
    void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args){
        Main m=new Main();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str+=" ";
        String str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                str2+=str.charAt(i);
                
            }
            else{
                m.insert(str2);
                str2="";
            }
        }
        m.display();
        m.delete("is");
        System.out.println();
        m.display();
    }
}
