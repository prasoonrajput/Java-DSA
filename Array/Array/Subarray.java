package Array;

public class Subarray {
    public static void prefix(int arr[]) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int prefix[] = new int[n];
        int sum = 0;

        // it is the prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

        }

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;

                sum = (start == 0 ? prefix[end] : prefix[end] - prefix[start-1]);

                if (sum > max) {
                    max = sum;
                }

            }

        }
        System.out.println(max);
    }

    public static void subarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = arr.length;
        int tp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] + " ");

                    sum = sum + arr[k];

                }
                tp++;
                System.out.print("  the sum is ==> " + sum);
                if (sum > max) {
                    max = sum;

                }
                if (sum < min) {
                    min = sum;

                }

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the total number of pair of sub array is " + tp);
        System.out.println("the min sum of sub array is " + min);
        System.out.println("the max sum of sub array is " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        // subarray(arr);
        prefix(arr);

    }
}
