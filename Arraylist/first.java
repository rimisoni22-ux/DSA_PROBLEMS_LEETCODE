  package Arraylist;
  import java.util.ArrayList;

public class first {
     public static void main(String[] args) {
         // java collection framework
        
        ArrayList<Integer>list = new ArrayList<> ();
        // ArrayList<Integer>list2  = new ArrayList<>();
        // ArrayList<Boolean>list3 = new ArrayList<> ();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
        //   list.add(1,9);
        //    System.err.println(list);
        //     // get opration
        //      int element = list.get(2);
        //      System.out.println(element);
        //      // set 
        //       list.set(2,10);
        //       System.out.println(list);
        //        System.out.println(list.contains(11));
           // print the Arraylist
            // for(int i=0;i<list.size();i++){
            //      System.out.print(list.get(i));

            // }
            //  System.out.println();

             // reverse the array list  tc = 0(n)
             for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i)+ " ");
             }
              System.out.println();


        
     }
    
}
