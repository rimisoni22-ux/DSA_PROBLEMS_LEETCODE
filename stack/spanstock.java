package stack;
import java.util.Stack;
// The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of the stock's price for all n days. The span of the stock's price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on those days is less than or equal to its price on the given day.

public class spanstock {
     public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1; // put 1because first element will always have span of 1
        s.push(0); // push the index of first element in stack
        for (int i=1;i<stocks.length;i++){
            while (!s.isEmpty() && stocks[s.peek()] < stocks[i]){ // if the current stock price is greater than the stock price at the index on top of the stack, then pop the index from the stack
                s.pop();
            }
            if (s.isEmpty()){ // if the stack is empty, then the span is the current index + 1
                span[i] = i+1;
            }else{
                span[i] = i - s.peek(); // if the stack is not empty, then the span is the current index - the index on top of the stack
            }
            s.push(i);

        

        
         }
     }
    public static void main (String args[]){
        int stocks [] = {100,80,60,70,60,85,100}; // the stock prices for 7 days
         int span [] = new int [stocks.length]; // the span array to store the span of each stock price
         stockSpan(stocks,span); // call the stockSpan function to calculate the span of each stock price
         for (int i=0;i<span.length;i++){ // print the span of each stock price
             System.out.println(span[i]);// the span of each stock price will be printed in the order of the stock prices
         }
    }


    
}

