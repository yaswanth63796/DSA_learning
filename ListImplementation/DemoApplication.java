public class DemoApplication
{

    public static void main(String[] args) {
        Stack st=new Stack();

        st.push(22);
        st.push(33);
        st.push(44);
        st.display();
        System.out.println();
        System.out.println(st.pop());
        System.out.println(st.peek());

    }
}