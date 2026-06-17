public class DemoApplication{

    public static void main(String[]args){

        CircularList list=new CircularList();
        list.insertbegin(22);
        list.insertbegin(33);
        list.insertbegin(44);
        list.insertbegin(55);
        list.insertend(99);
        list.insertend(100);
        list.display();
        list.insertpos(3,88);
        list.display();
        list.deletepos(2);
        list.display();
    }
}