class Node {
    int data;
    int height;   
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.height = 1;  // height of new node is 1
        left = right = null;
    }
}

class AVL {
    Node root;

    //height of a node
    int height(Node n) {
        if (n == null)
            return 0;
        return n.height;
    }

    //balance factor
    int getBalance(Node n) {
        if (n == null)
            return 0;
        return height(n.left) - height(n.right);
    }
    Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left),height(y.right))+1;
        x.height = Math.max(height(x.left),height(x.right))+1;
        return x;
    }
    Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left),height(x.right))+1;
        y.height = Math.max(height(y.left),height(y.right))+1;
        return y;
    }
    Node insert(Node node, int key){
        if(node == null){
            return new Node(key);
        }
        if(key< node.data){
            node.left = insert(node.left,key);
        }
        else if(key>node.data){
            node.right = insert(node.right,key);
        }
        else{
            return node;
        }
        node.height = 1+Math.max(height(node.left),height(node.right));
        int balance = getBalance(node);

        if(balance>1 && key < node.left.data)
            return rightRotate(node);

        if(balance < -1 && key > node.right.data)
            return leftRotate(node);

        if(balance > 1 && key > node.left.data){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if(balance < -1 && key < node.right.data){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }
    public void inOrder(Node node){
        if(node == null){
            return ;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    public void preOrder(Node node){
        if(node == null){
            return ;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(Node node){
        if(node == null){
            return ;
        }
        
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
}
public class AVLtree {
    public static void main(String[] args) {

        AVL tree = new AVL();   

        int[] arr = {10, 20, 30, 40, 50, 25};

        for (int i : arr)
            tree.root = tree.insert(tree.root, i); 
    
       System.out.println("Inorder");
        tree.inOrder(tree.root);
       System.out.println("\npreorder");
        tree.preOrder(tree.root);
       System.out.println("\npostorder");
        tree.postOrder(tree.root);
}
}
