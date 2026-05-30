package Arraylist;
 import java.util.ArrayList;
import java.util.Collections;

public class sort {
     public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(3);
        System.out.println(list);
            Collections.sort(list);
            System.out.println(list);
            // descending order
             Collections.sort(list, Collections.reverseOrder());
              System.out.println(list);
        
     }
     
    
}