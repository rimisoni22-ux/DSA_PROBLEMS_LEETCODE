package string;

public class stringbuilder {
  public static void main(String[] args) {
      StringBuilder sb= new StringBuilder("");
  for(char ch ='a';ch<='z';ch++){
    sb.append(ch);
  }
  // abcdefgh // o(26)
  
   System.out.println(sb.length());
}
   



  
}
