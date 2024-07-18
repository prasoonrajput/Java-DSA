package patterns;

public class pattern6 {
    public static void hollow_rectangle(int totrow, int totcol) {

        for (int i = 1; i <= totrow; i++) {
            for (int j = 1; j <= totcol; j++) {
                if (i == 1 || i == totrow || j == 1 || j == totcol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void inverted_half_pyramidwithNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print(j);
            }

            System.out.println();

        }
    }

    public static void floydTriangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <=i; j++) {
                if(((i+j)%2)!=0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("fjdhf");
        // hollow_rectangle(4,5);
        // inverted_half_pyramidwithNumbers(5);
        // floydTriangle(5);
        zero_one_triangle(5);
    }

}
