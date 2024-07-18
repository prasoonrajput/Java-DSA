
public class pattern2 {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {// outr loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
