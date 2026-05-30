package inheritance;
public class Class {

public static void main(String[] args) {
  // Fish shark = new Fish();
  // shark.eat (); 
  //  Dog dobby = new Dog ();
  //  dobby.eat();
  //  dobby.legs = 4;
  //  System.out.println(dobby.legs);

}         
  }
  // Base  
   class Animal {
    String color;
   
   void eat(){
  System.out.println("eats");
   }
   void breathe(){
    System.out.println("breathes");
   }
  }

 // Derived Class
//  class Fish extends Animal {
  // int fins;
  // void swim (){
    // System.out.println("swim in winter");
  // }
//  }

 // multilavel inharitance
//  class Mammals extends Animal{
  // void walk(){
    // System.out.println("walks");
  // }


//  }
  // class Dog extends Mammals{
  //  String bread;
  // }

   // Hierarchial inhheritance 
   class Mammals extends Animal{
    void walk(){
      System.out.println("walk");
    }
   }
    class Fish extends Animal{
      void swim (){
        System.out.println("swim");

      }
    }
 class Bird extends Animal {
  void fly (){
     System.out.println("fly");
  }
 }



