package AvlTree;

public class avlTree {
        public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node (int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;

    public avlTree(){
    }

    public int height() {
        return height(root);
      }
      private int height(Node node) {
        if (node == null) {
          return -1;
        }
        return node.height;
      }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.value);

        display(node.left,"Left child of "+ node.getValue()+" : ");
        display(node.right,"Right child of "+ node.getValue()+" : ");
    }

    public void insert( int val){
        root = insert(val, root);
    }
    private Node insert(int value, Node node){
        if(node== null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(value,node.left);
        }
        if(value>node.value){
            node.right = insert(value,node.right);
        }
        node.height =Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            if(height(node.left.left)-height(node.left.right)>0){
              return rightRotate(node);  
            }
            if(height(node.left.left)-height(node.left.right)<0){
              node.left = leftRotate(node.left);
              return rightRotate(node);  
            }
        }
        if(height(node.left)-height(node.right)<-1){
            //left heavy
            if(height(node.right.left)-height(node.right.right)<0){
              return leftRotate(node);  
            }
            if(height(node.right.left)-height(node.right.right)>0){
              node.right = rightRotate(node.left);
              return leftRotate(node);  
            }
        }
        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;
        p.height=Math.max(height(p.left), height(p.right)+1);
        c.height=Math.max(height(c.left), height(c.right)+1);
        return c;
    }

    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;
        p.height=Math.max(height(p.left), height(p.right)+1);
        c.height=Math.max(height(c.left), height(c.right)+1);
        return p;
    }

    public void populate (int[] arr){
        for(int i=0;i<arr.length;i++){
            this.insert(arr[i]);
        }
    }

    public void populateSorted (int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(arr[mid]);
        populateSorted(arr,start,mid);
        populateSorted(arr,mid+1,end);
    }

    public boolean balanced (){
        return balanced(root);
    }
    private boolean balanced (Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");

    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        inOrder(node.right);
        System.out.println(node.value+" ");

    }
}

