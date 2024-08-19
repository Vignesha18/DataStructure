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
    Main(){
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
    void leftBound(Node root){
        if(root.left!=null){
            System.out.print(root.data+" ");
            leftBound(root.left);
        }
    }
    void rightBound(Node root){
        if(root.right!=null){
            rightBound(root.right);
            System.out.print(root.data+" ");
        }
    }
    void leaf(Node root){
        if(root!=null){
            leaf(root.left);
            if(root.left==null && root.right==null){
                System.out.print(root.data+" ");
            }
            leaf(root.right);
        }
    }
    void Boundary(Node root){
        System.out.print(root.data+" ");
        leftBound(root.left);
        leaf(root.left);
        leaf(root.right);
        rightBound(root.right);
    }
    public static void main(String[] args){
        Main m=new Main();
        m.root=m.insert(m.root,50);
        m.root=m.insert(m.root,20);
        m.root=m.insert(m.root,70);
        m.root=m.insert(m.root,10);
        m.root=m.insert(m.root,25);
        m.root=m.insert(m.root,60);
        m.root=m.insert(m.root,90);
        m.Boundary(m.root);
        
    }
}
