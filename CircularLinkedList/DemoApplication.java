public class DemoApplication{

    public static void main(String[]args){
        CircularList list=new CircularList();
        list.insertbegin(2);
        list.insertbegin(3);
        list.insertend(5);
        list.insertend(9);


        list.display();
        list.deletelast();
        list.display();
    }
}