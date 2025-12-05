class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);   
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);  
        System.out.print(node.data + " ");
    }

    public int countOfNode(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countOfNode(node.left) + countOfNode(node.right);
    }

    // Height of tree
    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }
    //sum of the node data
    public int sumOfNodes(Node node){
        if(node == null){
            return 0;
        }
        return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
    }
    //find the sum of the leaf
    public int sumOfEndNodes(Node node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right==null){
            return 1;
        }
        return sumOfEndNodes(node.left)+ sumOfEndNodes(node.right);
    }
    //delete tree data
    public void deleteTree(Node node){
         root = null;
    }
}

public class binarytree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Inorder");
        tree.inOrder(tree.root);

        System.out.println("\nPreorder");
        tree.preOrder(tree.root);

        System.out.println("\nPostorder");
        tree.postOrder(tree.root);

        System.out.println("\nTotal number of nodes: " + tree.countOfNode(tree.root));
        System.out.println("Height of tree: " + tree.height(tree.root));
        System.out.println("sum of all nodes:"+tree.sumOfNodes(tree.root));
        System.out.println("sum of end nodes:"+tree.sumOfEndNodes(tree.root));
        tree.deleteTree(tree.root);
        
    }
}
