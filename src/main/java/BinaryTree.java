public class BinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }


    public static void inorderTraverse(Node root){
        //LDR
        if(root== null) return;

        inorderTraverse(root.left);
        System.out.print(root.data+" ");
        inorderTraverse(root.right);
    }

    public static void preorderTraverse(Node root){
        //DLR
        if(root== null) return;
        System.out.print(root.data+" ");
        preorderTraverse(root.left);
        preorderTraverse(root.right);
    }

    public static void postorderTraverse(Node root){
        //LRD
        if(root== null) return;
        preorderTraverse(root.left);
        preorderTraverse(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.right.left = new Node(60);
        preorderTraverse(root);
        System.out.println();
        inorderTraverse(root);
        System.out.println();
        postorderTraverse(root);
    }
}
