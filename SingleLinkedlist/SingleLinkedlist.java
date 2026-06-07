  class SingleLinkedlist{
   Node head;
   int size=0;


   public  void insertbegin(int data){


       Node newnode=new Node(data);
       newnode.next=head;
       head=newnode;
       size++;


   }

   public void insertend(int data){

       Node temp;
       temp=head;


       Node newnode=new Node(data);

       if(head==null){
           head=newnode;
           size++;
           return;
       }
       while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=newnode;
      size++;

   }

   public  void insertpos(int data,int pos){

       Node temp;
       temp=head;
       Node newnode=new Node(data);
       if(pos==1){
           insertbegin(data);
           return;
       }

       if(pos==size+1){
           insertend(data);
           return;
       }

       for(int i=1;i<pos-1;i++){
           temp=temp.next;
       }
       newnode.next=temp.next;
       temp.next=newnode;
       size++;

      }


      public void deletebegin(){

       if(head==null){
           System.out.println(
                   "LIST IS EMPTy"
           );
       }

       head=head.next;
       size--;

      }


      public void deleteend(){

       if(head==null){
           System.out.println("list is empty");
       }

       if(head.next==null){
           head=null;
           size--;
           return;
       }

       Node temp=head;
       while(temp.next.next!=null){
           temp=temp.next;
       }

       temp.next=null;
       size--;
      }

      public void deletepos(int index){

       Node temp;
       temp=head;

       if(index==1){
           deletebegin();
       }
       if(index==size){
           deleteend();
       }

       for(int i=1;i<index-1;i++){
           temp=temp.next;
       }
       temp.next=temp.next.next;
      }
   public void display(){

       Node temp;
        temp=head;
       while(temp!=null){
           System.out.print(temp.data+"->");
           temp=temp.next;
       }
       System.out.print("NULL");
   }























    class Node{
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
  }