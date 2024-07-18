package Strings;

public class shortestRoute {
    public static float shortestpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N') {
                y++;// north
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            }

        }
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestpath(path));

    }
}
