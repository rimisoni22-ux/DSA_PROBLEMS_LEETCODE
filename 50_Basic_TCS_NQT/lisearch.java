
public class lisearch {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 60, 80};
        int tar = 30;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                System.out.println(("element found at index : " + i));
                found = true;
                break;

            }

        }
        if (!found) {
            System.out.println("element not found");

        }

    }

}
