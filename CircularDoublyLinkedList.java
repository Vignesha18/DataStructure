public class Circulardoubly{
     Node head;
     Node tail;
     class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            
        }
    }
    Circulardoubly()
    {
        this.head=null;
        this.tail=null;
    }
    public void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            tail.next=head;
            head.prev=tail;
        }
        else{
            
            tail.next=newNode;
            newNode.next=head;
            head.prev=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public void displayForward(){
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
    public void displayBackward(){
        if(head==null){
            System.out.println("Empty");
        }
        else{
            Node n=tail;
            do{
                System.out.print(n.data+" ");
                n=n.prev;
            }while(n!=tail);
        }
        System.out.println();
    }
    public void delete(int val){
        if(head==null){
            System.out.println("Empty");
        }
        else if(head.data==val){
            head=head.next;
            tail.next=head;
            head.prev=tail;
        }
        else if(tail.data==val)
        {
            tail=tail.prev;
            tail.next=head;
            head.prev=tail;
        }
        else{
            Node current=head;
            while(current.next!=null && current.next.data!=val)
            {
                current=current.next;
            }
            current.next=current.next.next;
            current.next.prev=current;

        }
    }
    public void displaytail(){
        System.out.println(head.data+" "+tail.data);
    }
    public static void main(String[] args){
        Circulardoubly cs=new Circulardoubly();
        cs.add(1);
        cs.add(22);
        cs.add(102);
        cs.add(5);
        cs.add(9);
        cs.displayForward();
        cs.displayBackward();
        cs.delete(9);
        cs.displayForward();
        cs.displayBackward();
     }

}
