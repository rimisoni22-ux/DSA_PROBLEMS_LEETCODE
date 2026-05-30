package stack;
import stack.frame.Stack;


public class duplicatepranthesisi {
     public static boolean isDuplicate(String str)
{

    Stack<Character> stack = new Stack<>();
     for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch==')'){
             int count =0;
            while(stack.peek()!='('){
                count++;
                stack.pop();
            }
           
             if(count<1){
                return true; // duplicate parentheses found
             
            
        }
        else {
            stack.pop(); // pop the opening parenthesis
        }
    }
    else {
        stack.push(ch); // push the current character onto the stack
    }
     }
     return false; // no duplicate parentheses found
    
  
     


}
public static void main(String[] args) {
    Stack<Character> stack = new Stack<>();
    stack.push('(');
    stack.push('(');
    stack.push('a');
    stack.push('+');
    stack.push('b');
    stack.push(')');
    stack.push('(');
    stack.push('c');
    stack.push('+');
    stack.push('d');
    stack.push(')');
    
    System.out.println(isDuplicate("((a+b)(c+d))"));
  


}
}