package stack;
import java.util.Stack;
// The next greater element problem is a common problem in which we are given an array of integers

public class nextgreter {
    public static void nextGreater(int arr[], int nge[]) { // this function is used to calculate the next greater element for each element in the input array

        Stack<Integer> s  = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            //while loop is used to pop the elements from the stack until we find an element that is greater than the current element or the stack is empty
            while (!s.isEmpty() && s.peek() <= arr[i]) { // if the stack is not empty and the top element of the stack is less than or equal to the current element, then pop the element from the stack
                s.pop();
            }
            // if the stack is empty, then there is no greater element for the current element, so set the next greater element to -1
            if (s.isEmpty()) { // if the stack is empty, then there is no greater element for the current element, so set the next greater element to -1
                nge[i] = -1;
            } 
            // else, the top element of the stack is the next greater element for the current element, so set the next greater element to the top element of the stack
            else { // if the stack is not empty, then the top element of the stack is the next greater element for the current element, so set the next greater element to the top element of the stack
                nge[i] = s.peek();
            }
            // push the current element to the stack
            s.push(arr[i]); // push the current element to the stack
        }




    }

    //
     public static void main(String[] args) {
        int arr []= {4,5,2,10,8}; // the input array
        int nge [] = new int [arr.length]; // the array to store the next greater element for each element in the input array
        nextGreater(arr,nge); // call the nextGreater function to calculate the next greater element
        for (int i=0;i<nge.length;i++){ // print the next greater element for each element in the input array
            System.out.println(nge[i]); // the next greater element for each element in the input array will be printed in the order of the input array
        }

        
     }

    
}
