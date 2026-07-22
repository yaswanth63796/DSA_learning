import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
import java.util.List;

class Node{

    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }


    public static void preorder(Node root){

         if(root==null){
             return;
         }

         System.out.print(root.data+" ");
          preorder(root.left);
          preorder(root.right);
    }

    public static void inorder(Node root){

        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


   public static void postorder(Node root){

        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
       System.out.print(root.data+" ");
   }

   public static List<List<Integer>>levelorder(Node root){

        List<List<Integer>>ans=new ArrayList<>();

           if(root==null){
               return ans;
           }

            Queue<Node>queue=new LinkedList<>();
             queue.offer(root);

             while(!queue.isEmpty()){

                  int size=queue.size();
                 List<Integer>level=new ArrayList<>();
                 for(int i=0;i<size;i++){

                     Node current=queue.poll();
                     level.add(current.data);

                     if(current.left!=null){
                         queue.offer(current.left);
                     }
                     if(current.right!=null){
                         queue.offer(current.right);
                     }
                 }
                 ans.add(level);

             }
             return ans;

   }
}