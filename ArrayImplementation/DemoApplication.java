public class DemoApplication {
    public static void main(String[] args) {
        Stack st=new Stack(5);

        st.push(22);
        st.push(33);
        st.push(44);

        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
    }
}