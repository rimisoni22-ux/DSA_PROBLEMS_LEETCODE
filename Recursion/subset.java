package Recursion;

public class subset{

   public static void subsets(String ans ,String s ,int idx){
    if(idx==s.length()){
      System.out.println(ans+" ");

    }
    char ch = s.charAt(idx);
    subsets(ans+ch,s,idx+1);
    subsets(ans,s,idx+1);
   }
  public static void main(String[] args) {
    String s = "abc";
 
    List<String> list =new ArrayList<>();
         subsets("",s,0);
   
  }
}