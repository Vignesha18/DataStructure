class Main{
    Node root;
    class Node{
        String data;
        Node left;
        Node right;
        Node(String data){
            this.data=data;
        }
    }
    Main(){
        this.root=null;
    }
    public Node insert(Node root,String val){
        Node newNode=new Node(val);
        if(root==null){
            root=newNode;
        }
        else if(val.compareTo(root.data)<0){
            root.left=insert(root.left,val);
        }
        else if(val.compareTo(root.data)>0){
            root.right=insert(root.right,val);
        }
        return root;
    }
    public Node delete(Node root, String del){
        if(root==null){
            return root;
        }
        else if (del.compareTo(root.data)<0){
            root.left=delete(root.left,del);
        }
        else if( del.compareTo(root.data)>0){
            root.right=delete(root.right,del);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                root.data=min(root.right);
                root.right=delete(root.right,del);
            }
        }
        return root;
    }
    public String min(Node root){
        String minValue=root.data;
        while(root.left!=null){
            minValue=root.left.data;
            root=root.left;
        }
        return minValue;
    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args){
        Main m=new Main();
        m.root=m.insert(m.root,"Vicky");
        m.root=m.insert(m.root,"Santha");
        m.root=m.insert(m.root,"Sakthi");
        m.root=m.insert(m.root,"Arun");
        m.root=m.insert(m.root,"Waran");
        m.inorder(m.root);
        System.out.println();
        m.root=m.delete(m.root,"Arun");
        m.inorder(m.root);
    }
}
