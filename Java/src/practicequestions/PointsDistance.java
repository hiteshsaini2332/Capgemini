package practicequestions;

import java.util.Scanner;

public class PointsDistance {
    static void main() {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        double sum=0;
        sum+=calculateDistance(x1,y1,x2,y2);
        sum+=calculateDistance(x2,y2,x3,y3);
        sum+=calculateDistance(x3,y3,x1,y1);
        System.out.printf("%.2f",sum);
    }
    static double calculateDistance(int x1, int y1, int x2, int y2) {
        int temp1=(x2-x1)*(x2-x1);
        int temp2=(y2-y1)*(y2-y1);
        return Math.sqrt(temp2+temp1);
    }
}
