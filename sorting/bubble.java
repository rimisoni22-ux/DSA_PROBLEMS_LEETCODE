package sorting;

public class bubble {
  public static void sort(int arr[]){
 
    int n = arr.length-1;
    for(int turn=0; turn<n-1;turn++){
      for(int j=0; j<n-1-turn;j++){
         if(arr[j]>arr[j+1]){
          int temp =  arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
         }
      }
    }
  }
  public static void printarr(int arr[]) {
    for(int i=0;i<arr.length-1;i++){
      System.out.println(arr[i]+ " ");

    }
    System.out.println();
    
  }
  
  public static void main(String[] args) {
    int arr[] = {5,4,1,3,2};
    sort(arr);
    printarr(arr);

    
  }
}
