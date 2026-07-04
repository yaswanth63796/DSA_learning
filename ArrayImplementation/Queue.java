class Queue {

    private int[] arr;
    private int front;
    private int rear;
    private int currentsize;
    private int size;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
        currentsize = 0;
    }

    public void push(int data) {
        if (currentsize == size) {
            System.out.println("Queue Overflow");
            return;
        }

        if (currentsize == 0) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = data;
        currentsize++;
    }

    public int pop() {
        if (currentsize == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int el = arr[front];

        if (currentsize == 1) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        currentsize--;
        return el;
    }

    public int peek() {
        if (currentsize == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    public void display() {
        if (currentsize == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;
        for (int count = 0; count < currentsize; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }
}