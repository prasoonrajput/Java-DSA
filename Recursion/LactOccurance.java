public class LactOccurance {
    public static int LO(int arr[], int key, int index) {

        if (arr[index] == key) {
            return index;

        }
        if (index == 0) {
            return -1;
        }

        return LO(arr, key, index - 1);
    }

    public static int pow(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * pow(x, n - 1);
    }

    public static int optpow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfSQ = optpow(x, n / 2) * optpow(x, n / 2);

        if (n % 2 != 0) {
            return x * halfSQ;
        }
        return halfSQ;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 3, 10, 13, 14, 2, 5 };
        // int[] arr = { 5,5,5,5,5,5,5,5,5,5};
        int index = arr.length - 1;
        int key = 1;

        // System.out.println(LO(arr, key, index));
        System.out.println(optpow(2, 10));

    }

}
