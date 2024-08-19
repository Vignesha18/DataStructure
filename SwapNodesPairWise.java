class Main{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next =null;
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
    Node swap(){
        Node dummy=new Node(0);
        dummy.next=head;
        Node current=dummy;
        while(current.next!=null && current.next.next!=null){
            Node f=current.next;
            Node s=current.next.next;
            
            f.next=s.next;
            s.next=f;
            current.next=s;
            
            current=current.next.next;
        }
        return dummy.next;
    }
    void print(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args){
        Main m=new Main();
        m.insert(1);
        m.insert(2);
        m.insert(3);
        m.insert(4);
        m.insert(5);
        m.insert(6);
        m.head=m.swap();
        m.print();
    }
}
