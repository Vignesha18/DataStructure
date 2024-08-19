public class Circularsingly{
    private Node head;
    private Node tail;
    private static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Circularsingly(){
        this.head=null;
        this.tail=null;
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("Empty");
        }
        else{
            Node current=head;
            do{
                System.out.print(current.data+" ");
                current=current.next;
            }while(current!=head);
        }
        System.out.println();
    }
    public void delete(int val){
        if(head==null){
            System.out.println("Empty");
        }
        else if(head.data==val){
            head=head.next;
        }
        else{
            Node current=head;
            while(current.next!=head && current.next.data!=val){
                current=current.next;
            }
            if(current.next.data==val){
                current.next=current.next.next;
            }

        }
    }
    public void displaytail(){
        System.out.println(head.data+" "+tail.data);
    }
    public static void main(String[] args){
        Circularsingly cs=new Circularsingly();
        cs.add(1);
        cs.add(22);
        cs.add(102);
        cs.add(5);
        cs.add(9);
        cs.display();
        cs.delete(102);
        cs.display();
     }

}
