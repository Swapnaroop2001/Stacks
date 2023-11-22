import java.util.*;


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
        if (top == capacity - 1) {
            System.out.println("stack is full");
            return;
        } else {
            top++;
            arr[top] = x;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Poped element :" + " " + arr[top]);
            int[] k = new int[top--];
            for (int i = 0; i < k.length; i++) {
                k[i] = arr[i];
            }
            System.out.println("Stack after pop operation: ");
            for (int i = 0; i <= top; i++) {
                System.out.println(k[i]);
            }
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public int getMin() {
        Arrays.sort(arr);
        return arr[1];

    }

    // Valid parentheses
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        char[] j = s.toCharArray();
        for (int i = 0; i < j.length; i++) {
            if (j[i] == '(') {
                stk.push(')');
            } else if (j[i] == '{') {
                stk.push('}');
            } else if (j[i] == '[') {
                stk.push(']');
            } else if (stk.empty() || stk.pop() != j[i]) {
                return false;
            }
        }
        return stk.isEmpty();
    }

    public int evalRPN(String[] tokens) {
        int u, v;
        Stack<Integer> stk = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                u = stk.pop();
                v = stk.pop();
                stk.push(u + v);
            } else if (tokens[i].equals("-")) {
                u = stk.pop();
                v = stk.pop();
                stk.push(v - u);

            } else if (tokens[i].equals("/")) {
                u = stk.pop();
                v = stk.pop();
                stk.push(v / u);
            } else if (tokens[i].equals("*")) {
                stk.push(stk.pop() * stk.pop());
            } else {
                int k = Integer.parseInt(tokens[i]);
                stk.push(k);
            }
        }
        return stk.pop();
    }

    //Reverese the given words.
    public void reverseWords(String str) {
        Stack <Character> stk = new Stack <Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' ') {
                stk.push(str.charAt(i));
            } else {
                while (!stk.isEmpty()) {
                    System.out.print(stk.pop());
                }
                System.out.print(" ");
            }
        }
        while (!stk.isEmpty()) {
            System.out.print(stk.pop());
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]={};
        

        return ans;
    }

    public static void main(String[] args) {
        Stackimplementation stk = new Stackimplementation(5);
        stk.push(4);
        stk.push(57);
        stk.push(87);
        stk.push(77);

        stk.reverseWords("Man Of The Match goes to Virat");

        

    }
}