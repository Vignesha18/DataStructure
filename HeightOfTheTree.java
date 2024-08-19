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
    int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left)+1;
        int rightHeight=height(root.right)+1;
        return leftHeight>rightHeight?leftHeight:rightHeight;
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
        m.inorder(m.root);
        System.out.println(m.height(m.root));
 
        
    }
}
