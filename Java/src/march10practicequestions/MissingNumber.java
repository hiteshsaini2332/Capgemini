package march10practicequestions;

import java.util.Scanner;

public class MissingNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
       n=n+1;
        long orig= (long) n *(n+1)/2;
        System.out.println(orig-sum);

    }
}
