class Main{
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public Main(){
        this.root=null;
    }
    
    Node insert(Node root,int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
        }
        else if(data<root.data){
            root.left=insert(root.left,data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    public static void main(String[] args){
        Main m=new Main();
        m.root=m.insert(m.root,60);
        m.root=m.insert(m.root,40);
        m.root=m.insert(m.root,10);
        m.root=m.insert(m.root,45);
        m.root=m.insert(m.root,70);
        m.root=m.insert(m.root,55);
        m.root=m.insert(m.root,90);
        m.inorder(m.root);
        
    }
}
