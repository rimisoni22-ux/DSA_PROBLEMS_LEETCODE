package Recursion;
public class binarystrin {
   
 public static  void printStrings(int n,int lastplace,String str) {
        // code here 
         //kaam
          if(n==0){  
             System.out.println(str);
              return;
              
          } 
          // kaam 
            // sit 0 on chair n 
      printStrings(n-1,0,str+"0");
            // append 1 from last if there is no 1 
            if(lastplace==0){
           
            
      printStrings(n-1,1,str+"1");
         }
        }
        
    public static void main(String args[]){
            printStrings(3,0," ");
          }

              
        
    }
