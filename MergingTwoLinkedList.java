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
    void merge(Node l1,Node l2){
        Node current=l1;
        while(current.next!=null){
            current=current.next;
        }
        current.next=l2;
    }
    void display(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
        
    }
    public static void main(String[] args) {
        Main m1=new Main();
        m1.insert(50);
        m1.insert(90);
        m1.insert(30);
        m1.insert(60);
        m1.insert(10);
        Main m2=new Main();
        m2.insert(40);
        m2.insert(80);
        m2.insert(20);
        m2.insert(70);
        m2.insert(100);
        m1.merge(m1.head,m2.head);
        m1.display();
    }
}
