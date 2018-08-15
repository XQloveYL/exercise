import java.util.Scanner;

public class SolutionB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pointNum = 0;
        int totalDistance = 0;

        if (scan.hasNext()) {
            pointNum = Integer.parseInt(scan.next());
        }

        int source_x = 0;
        int source_y = 0;
        int pre_x = 0;
        int pre_y = 0;

        for (int i = 0; i < pointNum; i++) {
            if (scan.hasNext()) {
                String position = scan.next();
                if (i == 0) {
                    source_x = 0;
                    source_y = 0;
                    pre_x = source_x;
                    pre_y = source_y;
                } else {
                    int x = Integer.parseInt(position.split(",")[0]);
                    int y = Integer.parseInt(position.split(",")[1]);
                    totalDistance += (Math.abs(x - pre_x) + Math.abs(y - pre_y));
                    pre_x = x;
                    pre_y = y;
                }
            }
        }

        totalDistance += (Math.abs(source_x - pre_x) + Math.abs(source_y - pre_y));

        System.out.println(String.format("The total distance is %s.", totalDistance));
    }
}

