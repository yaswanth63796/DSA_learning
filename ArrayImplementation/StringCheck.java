

import java.util.Stack;
public class StringCheck {

    public static void main(String[] args) {


        String s="2-1+2";


        Stack<Integer>st=new Stack();

         for(int i=0;i<s.length();i++){

             if(s.charAt(i)=='+'){

                 int top=st.pop();
                 int num=s.charAt(i+1)-'0';

                 st.push(top+num);
                 i++;

             }

             else if(s.charAt(i)=='-'){

                 int top=st.pop();
                 int num=s.charAt(i+1)-'0';

                 st.push(top-num);
                 i++;
             }

             else{
                 st.push(s.charAt(i)-'0');
             }
         }

        System.out.println(st.pop());
    }

}
