public class Stack{
    private int[]arr;
    private int top;

    public Stack(int size){

        arr=new int[size];
        top=-1;
    }



    public void push(int val){


        if(top==arr.length-1){
            System.out.println("stack is overflow");
            return;
        }

        arr[++top]=val;
    }

    public int pop(){

        if(top==-1){
            System.out.println("stack is underflow");
            return -1;
        }

       return arr[top--];
    }

    public int peek(){

        if(top==-1){
            System.out.println("stack is underflow");
            return -1;
        }

        return arr[top];
    }
    public void display(){

        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }



    }
}