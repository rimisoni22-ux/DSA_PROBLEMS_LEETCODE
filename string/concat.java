package string;

 public class concat {
public static void printletters(String str){
  for(int i =0;i<str.length();i++){
    System.out.print(str.charAt(i)+ " ");

  }
  System.out.println();
}


  public static void main(String[] args) {
    
  
  String firstName ="Shradha";
  String LastName ="khapra";
  String fullName = firstName + " " + LastName;
 printletters(fullName);
  
  }
  
}
