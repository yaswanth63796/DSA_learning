public class DemoApplication {
    public static void main(String[] args) {

        Queue q=new Queue(10);

        q.push(22);
        q.push(33);
        q.push(44);
        q.push(99);
        q.push(100);
        q.display();
        System.out.println();
        System.out.println(q.pop());
        System.out.println();
        q.display();
    }
}