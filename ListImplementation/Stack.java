public class Stack{

    private Node top;
    private int size;



    public void push(int data){
        Node newnode=new Node(data);
        newnode.next=top;
        top=newnode;
        size++;

    }


    public int pop(){

        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }

        int val=top.data;
         top=top.next;
         size--;
         return val;
    }

    public void display(){

        Node temp=top;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

public int peek(){

        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return top.data;
}



public boolean isEmpty(){

        return top==null;
}









    public class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

}