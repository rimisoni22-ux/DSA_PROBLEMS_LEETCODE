package Recursion;

public class firstocc {
   public  static int firsto(int arr[],int key,int i){ 
    if(i==arr.length) {
      return -1;
    }
    if(arr[i]==key){
      return i;
    } 
     return firsto(arr,key,i+1); // for continity of our code exection
   }  
    // public static int lasto(int arr[],int key,int i){
      //  
      // if(i==arr.length) {
        // return-1;

      // } 
      //  int isfound = lasto(arr,key,i+1); 
      //  if(isfound !=-1){
        // return isfound;
      // }
 
        //  return i;
      //  }
    // } 
     

   public static void main(String[] args) {
    int arr[] = { 2,5,6,7,5};
    int key = 5;
    //  
     System.out.println(firsto(arr,5,0)); 
     
    
   }  
}
