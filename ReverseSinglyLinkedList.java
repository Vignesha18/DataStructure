class Main{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Main(){
        this.head=null;
    }
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    void displayReverse(){
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null){
            next=current.next;  
            current.next=prev;  
            prev=current;       
            current=next;       
        }
        head=prev;
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
        m.insert(10);
        m.insert(20);
        m.insert(30);
        m.insert(40);
        m.insert(50);
        m.displayReverse();
        m.display();
    }
}
