public class pairsum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9};
        int target = 8;
        findPairs(arr, target);
    }

    public static void findPairs(int[] arr, int target) {
        int n = arr.length;
        int lp =0,rp=n-1;
        while(lp<rp){
            int sum = arr[lp]+arr[rp];
            if(sum==target){
                System.out.println(arr[lp]+" "+arr[rp]);
                lp++;
                rp--;
            }
            else if(sum<target){
                lp++;
            }
            else{
                rp--;
            }
        }


    }
         
        
}