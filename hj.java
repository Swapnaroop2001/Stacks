import java.util.*;;
public class hj {
  
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>(); // create an empty stack
            for (char c : s.toCharArray()) { // loop through each character in the string
                if (c == '(') // if the character is an opening parenthesis
                    stack.push(')'); // push the corresponding closing parenthesis onto the stack
                else if (c == '{') // if the character is an opening brace
                    stack.push('}'); // push the corresponding closing brace onto the stack
                else if (c == '[') // if the character is an opening bracket
                    stack.push(']'); // push the corresponding closing bracket onto the stack
                else if (stack.isEmpty() || stack.pop() != c) // if the character is a closing bracket
                    // if the stack is empty (i.e., there is no matching opening bracket) or the top of the stack
                    // does not match the closing bracket, the string is not valid, so return false
                    return false;
            }
            // if the stack is empty, all opening brackets have been matched with their corresponding closing brackets,
            // so the string is valid, otherwise, there are unmatched opening brackets, so return false
            return stack.isEmpty();
        
    }

    public static void main(String[] args) {
        Stack  <Integer> foo = new Stack  <Integer>();
        foo.push(10);
        foo.push(20);
        foo.push(30);
        foo.push(40);
        int k=foo.size();
        System.out.println(k);
        
    }
}
