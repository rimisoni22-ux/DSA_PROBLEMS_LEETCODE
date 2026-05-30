package stack;
import java.util.Stack;

public class larrecinhistogram {

     public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int nsr[] = new int [heights.length];
        int nsl[] = new int [heights.length];

        // next smaller element to the left
        Stack<Integer> s = new Stack<>();
        // we iterate through the heights array and for each bar, we pop the elements from the stack until we find a bar that is smaller than the current bar or the stack is empty.
        // If the stack is empty,
        // it means there is no smaller bar to the left, 
        // so we set nsl[i] to the length of the heights array. Otherwise, we set nsl[i] to the index of the smaller bar found on top of the stack. Finally, we push the current index onto the stack.
        for (int i = 0; i < heights.length; i++) {
            // while loop is used to pop the elements from the stack until we find a bar that is smaller than the current bar or the stack is empty
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            // if the stack is empty, it means there is no smaller bar to the left,
            // so we set nsl[i] to the length of the heights array. Otherwise, we set nsl[i] to the index of the smaller bar found on top of the stack. Finally, we push the current index onto the stack.

            if (s.isEmpty()) {
                nsl[i] = heights.length;
            } 
        // else, we set nsl[i] to the index of the smaller bar found on top of the stack. 

            else {
                nsl[i] = s.peek();
            }
         //Finally, we push the current index onto the stack.
            s.push(i);
        }



        // next smaller element to the right
        s = new Stack<>();
        for (int i =0 ;i< heights.length - 1;i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = -1;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // calculate the area for each bar and find the maximum area
   
        for (int i = 0; i < heights.length; i++) {
                int width = nsl[i] - nsr[i] - 1;
                int area = heights[i] * width;
                maxArea = Math.max(maxArea, area);


   
        }
        return maxArea;
    }

       
   public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
       
   }

    
}
