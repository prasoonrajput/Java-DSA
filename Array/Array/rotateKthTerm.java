public class rotateKthTerm {

    public static void reverse(int[] arr, int s, int e) {
        int starting = s;
        int ending = e;
        while (starting <= ending) {
            int temp = arr[starting];
            arr[starting] = arr[ending];
            arr[ending] = temp;
            starting++;
            ending--;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int k = 3;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        // System.out.println(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
