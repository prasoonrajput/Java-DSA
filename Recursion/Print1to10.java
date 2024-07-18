public class Print1to10 {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        } else {
            System.out.print(n+" ");
            printDec(n - 1);
        }
    }

    public static void main(String[] args) {
        printDec(10);
    }

}
