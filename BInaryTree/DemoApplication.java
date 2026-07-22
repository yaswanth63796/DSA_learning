import java.util.*;

public class DemoApplication {
    public static void main(String[] args) {


        Node root=new  Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(4);

         Node.preorder(root);
        System.out.println();
        Node.inorder(root);
        System.out.println();
        Node.postorder(root);
        System.out.println();
        List<List<Integer>>result=Node.levelorder(root);
        System.out.println(Node.levelorder(root));

    }
}