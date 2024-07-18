public class FirstOccurance {
    public static int Firstoccurance(int arr[], int key, int i) {
        if (arr[i] == key) {
            return i;
        }
        if (i== arr.length - 1) {
            System.out.println("hi");
            return -1;
        }
        return Firstoccurance(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10, 13, 14 };
        int i = 0;
        int key = 14;
        System.out.println(Firstoccurance(arr, key, i));

    }

}
