 import java.util.Scanner;

 package Recursion;
// function calling 

public class function {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     print(5);
    
  }
   public static void print(int n){
    if(n==0) return;
    System.out.println(n); 
    print(n-1);


   }  
}
