package array;
public class reverse {
    public static reverse_array(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            int arr[start] = arr[end];
            arr[end] = temp;
            
        }
         System.out.println(arr[])
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,7,8};
        
        
    }
   
  
}
