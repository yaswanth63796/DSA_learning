public class DemoApplication {

    public static void main(String[]args){

        Doublylinkedlist list=new Doublylinkedlist();

        list.insertbegin(22);
        list.insertend(33);
        list.insertend(44);
        list.insertpos(77,2);
        //list.deletebegin();
        //list.deleteend();
        list.deletepos(2);

        list.display();
    }
}