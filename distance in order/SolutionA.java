import java.util.Scanner;

public class SolutionA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = 0;

        if (scan.hasNext()) {
            arraySize = Integer.parseInt(scan.next());
        }

        Point[] array = new Point[arraySize];

        for (int i = 0; i < arraySize; i++) {
            if (i == 0) {
                Point p = new Point(0,0);
                array[i] = p;
            } else if (scan.hasNext()) {
                String position = scan.next();
                int x = Integer.parseInt(position.split(",")[0]);
                int y = Integer.parseInt(position.split(",")[1]);
                Point p = new Point(x, y);
                array[i] = p;
            }
        }

        // min distance - dynamic programming
        int minDistance;

        System.out.println(minDistance);
    }

    static int distance(Point a, Point b) {
        return Math.abs(a.x - b.x) + Math.abs((a.y - b.y));
    }
}

class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
