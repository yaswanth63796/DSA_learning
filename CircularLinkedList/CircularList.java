class CircularList{
    Node head;
    Node tail;
    int size=0;



    public void insertbegin(int data){

        Node newnode=new  Node(data);

           if(head==null){

               head=tail=newnode;
               newnode.next=head;
           }
           else{
               newnode.next=head;
               head=newnode;
               tail.next=head;
           }

 size++;
    }


    public void insertend(int data){

        Node newnode=new Node(data);

          if(head==null){
              head=tail=newnode;
              newnode.next=head;

          }

          else{

              tail.next=newnode;
              newnode.next=head;
              tail=newnode;
          }
          size++;

    }

    public void insertpos(int data,int index){

        Node newnode=new Node(data);
          if(index<1 && index>size+1){
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
          Node temp=head;

          for(int i=0;i<index-1;i++){
              temp=temp.next;
          }

          newnode.next=temp.next;
          temp.next=newnode;

          size++;

    }

    public void deletefirst(){

        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
            tail.next=head;
            size--;
        }
    }


    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
        }

        if(head==tail){
            head=tail=null;
        }

        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }

        tail=temp;
        tail.next=head;
        size--;
    }

    public void display(){

        Node temp=head;
        if(head==null){
            System.out.println("List is Empty");
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

    public Node(Node next, int data) {
        this.next = null;
        this.data = data;
    }

    public Node(int data){
        this.data=data;
    }
}