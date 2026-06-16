class Doublylinkedlist{

    Node head;
    Node tail;
    int size=0;




    public void insertbegin(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=tail=newnode;

        }

        else{

            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
        size++;
    }

    public void insertend(int data){

        Node newnode=new Node(data);

        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
        size++;
    }

    public void insertpos(int data,int index){

        Node newnode=new Node(data);

        Node temp=head;

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
            System.out.println("LIST IS EMPTY");
        }
        if(head.next==null){
            head=tail=null;
            size--;
            return;
        }
        head.next.prev=null;
        head=head.next;
        size--;
    }

    public void deleteend(){

        if(head==null){
            System.out.println("List is empty");
        }
        if(head.next==null){
            head=tail=null;
            size--;
            return;
        }

        tail.prev.next=null;
        tail=tail.prev;
        size--;
    }

    public void deletepos(int index){

        Node temp;
        temp=head;

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

        Node temp;
        temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
}
































class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}