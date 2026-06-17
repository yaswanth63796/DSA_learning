class CircularList{
    Node head;
    Node tail;
    int  size=0;


    public void insertbegin(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=tail=newnode;
            head.next=head;
            head.prev=head;
            size++;
            return;

        }

        newnode.next=head;
        head.prev=newnode;
        newnode.prev=tail;
        tail.next=newnode;
        head=newnode;
        size++;


    }
    public void insertend(int data){

        Node newnode=new  Node(data);
        if(head==null){
            head=tail=newnode;
            head.prev=head;
            head.next=head;
            size++;
            return;
        }

         newnode.next=head;
        newnode.prev=tail;
        tail.next=newnode;
        tail=newnode;
        size++;

    }

    public void insertpos(int index,int data){


        Node newnode=new Node(data);
        Node temp=head;

         if(index<1||index>size){
             System.out.println("Invalid postion");
         }

         if(index==1){
             insertbegin(data);
             return;
         }
         if(index==size+1){
             insertend(data);
             return;
         }

        for(int i=1;i<index-1;i++){
            temp=temp.next;
        }
        newnode.prev=temp;
        newnode.next=temp.next;
        temp.next.prev=newnode;
        temp.next=newnode;
        size++;
    }

    public void deletebegin(){


        if(head==null){
            System.out.println("list is empty");
        }

        head=head.next;
        head.prev=tail;
        tail.next=head;
        size--;
    }


    public void deleteend(){

        if(head==null){
            System.out.println("list is empty");
        }
        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
    }

    public void deletepos(int index){
        Node temp=head;
         if(head==null){
             System.out.println("list is empty");
         }

         if(index==1){
             deletebegin();
             return;
         }

         if(index==size){
             deleteend();
             return;
         }

          for(int i=1;i<index-1;i++){

              temp=temp.next;
          }

          temp.next.next.prev=temp;
          temp.next=temp.next.next;
          size--;
    }
       public void display(){
        Node temp=head;

        if(head==null){
            System.out.println("list is  empty");
        }


        do{

            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
           System.out.println("NULL");
       }

}


class Node{

    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data=data;
    }

    public Node(int data,Node next,Node prev){

        this.data=data;
        this.next=next;
        this.prev= next;
    }
}