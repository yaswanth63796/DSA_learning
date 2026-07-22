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



}