public class Stackimplementation {
    int[] arr;
    int top = -1;
    int capacity;

    Stackimplementation(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("stack is full");
        } else {
            top += 1;
            arr[top] = x;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stackimplementation stk = new Stackimplementation(5);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(4);
        stk.print();

    }
}