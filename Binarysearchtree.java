class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left = right= null;
    }
}
class BinarySearchTreeMethods{
        Node root = null;
        //insert function
    public Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(root.data > data){
            root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right, data);
        }
        return root;
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
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(Node node){
        if(node == null){
            return ;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    //search function
    public String search(Node root, int value) {
        if (root == null) {
            return "no data";
        }
        if (root.data == value) 
            return "found in root";
        if (value < root.data) return search(root.left, value);
        else return search(root.right, value);
    } 
    //Find Minimum
    public int findMin(Node node) {
        while (node.left != null){
            node = node.left;
        }
        return node.data;
    }
    // Find maximum
    public int findMax(Node root){
        while(root.right !=null){
            root = root.right;
        }
        return root.data;

    }
    /*delete operation
    public void delete(Node root){
        if(root==null){
            return;
        }
        root = null;
    }*/
    //delete by value
    public Node delete(Node root,int value){
        if(root==null){
            return null;
        }
        if(root.data>value){
             root.left=delete(root.left,value);
        }else if(root.data<value){
            root.right=delete(root.right,value);

        }else{
            if(root.left==null||root.right==null){
                return null;
            }
            if(root.left==null){
                 return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            int min=findMin(root.right);
            root.data=min;
            root.right=delete(root.right,value);
            

        }
        return root;
    
    }
    //binary search tree by  mirror function 
    public Node mirror(Node node) {
    if (node == null) {
        return null;
    }
    Node temp = node.left;
    node.left = node.right;
    node.right = temp;

    mirror(node.left);
    mirror(node.right);

    return node;
}


}
    
public class Binarysearchtree {
    public static void main(String[] args) {
        BinarySearchTreeMethods tree = new BinarySearchTreeMethods();
        int[] values = {50, 30, 20, 40, 70, 60, 80};

        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }
         System.out.println("InOrder");
         tree.inOrder(tree.root);
         System.out.println("\nPreorder");
         tree.preOrder(tree.root);
         System.out.println("\nPostorder");
         tree.postOrder(tree.root);
         System.out.println("\nsearching 60:"+tree.search(tree.root,40));
         System.out.println("searching 90:"+tree.search(tree.root,90));
         System.out.println("Minimum value: " + tree.findMin(tree.root));
         System.out.println("Maximum value: " + tree.findMax(tree.root));
         tree.delete(tree.root ,70);
         System.out.println("Mirroring Tree...");
         tree.mirror(tree.root);
         System.out.println("PreOrder after mirror:");
         tree.preOrder(tree.root);
    }

    
}
