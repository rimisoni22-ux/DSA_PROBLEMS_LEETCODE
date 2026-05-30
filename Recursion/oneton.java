 import java.util.*;
package Recursion;
 import java.util.Scanner;

public class oneton {
   static int n;
  public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
       n = sc.nextInt();
     print(1);  
  }
  public static void print(int n) {
   if (n==0) return;
      print(n-1);
      System.out.println(n + " ");
   
  }
   // public static void print(int x) {
      //  if(x>n) return ;
      //  System.out.println(x);
      //  print(x+1);
   // }  
}
