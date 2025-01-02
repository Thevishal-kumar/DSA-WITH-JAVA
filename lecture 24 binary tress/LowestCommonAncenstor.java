import java.util.*;
    
public class LowestCommonAncenstor{
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

    public static Node lca2(Node root, int n1, int n2){
        if(root ==null || root.data == n1 || root.data==n2){
            return root;
        }

        Node leftLca = lca2(root.left,n1,n2);
        Node rightLca = lca2(root.right,n1,n2);

        //leftLca = val rightLca=null
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca ==null){
            return rightLca;
        }


        return root;
        
    }
public static void main(String args[]) {
     Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    
    int n1=4,n2=6;
    System.out.println(lca2(root,n1,n2).data);
}
}