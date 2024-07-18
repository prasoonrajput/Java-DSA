package Array;

public class largestNumber {
    public static int largestNumberr(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest=arr[i];
            }
        }
        System.out.println("smallest number is " + smallest);
        return largest;

    }

    public static void main(String[] args) {

        // int[] arr=new int[50];
        int arr[] = { 1, 200, 6, 3, 50 };
        System.out.println(largestNumberr(arr));

    }
}
