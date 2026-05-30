package backtracking;

public class array {
  public static void changeArr(int arr[],int i ,int val){
    // base case 
    if(i==arr.length){
      printArr(arr);
      return ;
    }


    // recursion
    arr[i] = val;


  }
  public static void printArr(int arr[]){
     for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]+ " ");
     }
      System.out.println();
  }


  public static void main(String[] args) {
    int  arr[] = new int[5];
    // change the array
    changeArr(arr,0,1);
    // print the value of array
    printArr(arr);

  }
  
}
