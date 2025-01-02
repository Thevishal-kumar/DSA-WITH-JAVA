import java.util.*;
    
public class TransformToSumTree{
    static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right= null;
    }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public  static int tranform(Node root){
        if(root == null){
            return 0;
        }
        int leftChild = tranform(root.left);
        int rightChild = tranform(root.right);

        int data = root.data;
        int newLeft = root.left == null?0:root.left.data;
        int newright = root.right == null?0:root.right.data ;

        root.data = newLeft +leftChild + newright + rightChild;

        return data;

    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
public static void main(String args[]) {
     Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    tranform(root);
    preOrder(root);
    }
}