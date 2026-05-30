package abstrction;
public class absclass {
  public static void main(String[] args) {
    Mustang myHorse = new Mustang(); 
    // Horse h = new Horse ();
    // h.eat();
    // h.walk();
    // System.out.println(h.color);       
  } 
} 
// give the idea about any function 
 
 abstract class Animal {
  String color;
  Animal (){
    System.out.println("animal construtor called ");
  }
   void eat (){
    System.out.println("Animal eats");
   }  
   abstract  void walk ();
 }
  class Horse extends Animal {
    Horse (){
      System.out.println("Horse constructor called");
    }
    void changeColor(){
    color="dark brown";
}
    void walk(){
      System.out.println("walks on 4 legs");
    }
  }
  class Mustang extends Horse {
    Mustang(){
      System.out.println();
    }

  }

   class Chicken extends Animal {
    void changeColor(){
      color="yellow";
    }
   }
 
 
 
 


