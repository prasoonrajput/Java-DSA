import java.util.*;

public class IsSorted {
    public static boolean isShorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;// base case
        }
        if (arr[i] > arr[i + 1]) {

            return false;
        } 
        return isShorted(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10, 13, 14 };
        int i = 0;
        boolean found = isShorted(arr, i);
        System.out.println(found);

    }

}
