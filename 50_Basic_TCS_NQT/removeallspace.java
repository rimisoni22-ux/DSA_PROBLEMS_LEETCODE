//  //BRUETE FORCE
//  class GfG {

//     static String removeSpaces(String s) {
//         char[] arr = s.toCharArray();
//         int n = arr.length;
    
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == ' ') {
    
//                 // shift all characters to the left
//                 // starting from current index
//                 for (int j = i; j < n - 1; j++) {
//                     arr[j] = arr[j + 1];
//                 }
//                 n--;
//                 i--;
//             }
//         }
    
//         // return string up to new valid length
//         // without spaces
//         return new String(arr, 0, n); 
//     }

//     public static void main(String[] args) {
//         String s = "g  eeks   for ge  eeks  ";
//         System.out.print(removeSpaces(s));
//     }
// }


// //BRUTE FORCE 




//     static String removeSpaces(String s) {
//         char[] arr = s.toCharArray();
//         int n = arr.length;
    
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == ' ') {
    
//                 // shift all characters to the left
//                 // starting from current index
//                 for (int j = i; j < n - 1; j++) {
//                     arr[j] = arr[j + 1];
//                 }
//                 n--;
//                 i--;
//             }
//         }
    
//         // return string up to new valid length
//         // without spaces
//         return new String(arr, 0, n); 
//     }

//     public static void main(String[] args) {
//         String s = "g  eeks   for ge  eeks  ";
//         System.out.print(removeSpaces(s));
//     }
// }


public class removeallspace {

    static String removeSpaces(String s) {

        // replace all spaces with empty string
        s = s.replace(" ", "");
        return s;
    }

    public static void main(String[] args) {
        String s = "g  eeks   for ge  eeks  ";
        System.out.print(removeSpaces(s));
    }
}


