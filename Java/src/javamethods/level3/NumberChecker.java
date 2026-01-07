package javamethods.level3;

import java.util.*;

public class NumberChecker {

    static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    static int[] getDigits(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    static boolean isDuck(int[] d) {
        for (int x : d) if (x != 0) return true;
        return false;
    }

    static boolean isArmstrong(int n, int[] d) {
        int p = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == n;
    }

    static int[] largestTwo(int[] d) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max1) { max2 = max1; max1 = x; }
            else if (x > max2 && x != max1) max2 = x;
        }
        return new int[]{max1, max2};
    }

    static int[] smallestTwo(int[] d) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min1) { min2 = min1; min1 = x; }
            else if (x < min2 && x != min1) min2 = x;
        }
        return new int[]{min1, min2};
    }

    static int sumDigits(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    static double sumSquares(int[] d) {
        double s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    static boolean isHarshad(int n, int[] d) {
        return n % sumDigits(d) == 0;
    }

    static int[][] digitFrequency(int[] d) {
        int[][] f = new int[10][2];
        for (int i = 0; i < 10; i++) f[i][0] = i;
        for (int x : d) f[x][1]++;
        return f;
    }

    static int[] reverseArray(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) r[i] = d[d.length - 1 - i];
        return r;
    }

    static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    static boolean isPalindrome(int[] d) {
        return arraysEqual(d, reverseArray(d));
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq > 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }

    static boolean isSpy(int[] d) {
        int s = 0, p = 1;
        for (int x : d) { s += x; p *= x; }
        return s == p;
    }

    static boolean isAutomorphic(int n) {
        return String.valueOf(n * n).endsWith(String.valueOf(n));
    }

    static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    static int[] factors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) c++;
        int[] f = new int[c];
        int k = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[k++] = i;
        return f;
    }

    static int greatestFactor(int[] f) {
        int g = f[0];
        for (int x : f) g = Math.max(g, x);
        return g;
    }

    static int sumFactors(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    static long productFactors(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    static double productCubeFactors(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }

    static boolean isPerfect(int n, int[] f) {
        int s = 0;
        for (int x : f) if (x != n) s += x;
        return s == n;
    }

    static boolean isAbundant(int n, int[] f) {
        int s = 0;
        for (int x : f) if (x != n) s += x;
        return s > n;
    }

    static boolean isDeficient(int n, int[] f) {
        int s = 0;
        for (int x : f) if (x != n) s += x;
        return s < n;
    }

    static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) f *= i;
        return f;
    }

    static boolean isStrong(int[] d, int n) {
        int s = 0;
        for (int x : d) s += fact(x);
        return s == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] d = getDigits(n);
        int[] f = factors(n);

        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Duck: " + isDuck(d));
        System.out.println("Armstrong: " + isArmstrong(n, d));
        System.out.println("Palindrome: " + isPalindrome(d));
        System.out.println("Harshad: " + isHarshad(n, d));
        System.out.println("Prime: " + isPrime(n));
        System.out.println("Neon: " + isNeon(n));
        System.out.println("Spy: " + isSpy(d));
        System.out.println("Automorphic: " + isAutomorphic(n));
        System.out.println("Buzz: " + isBuzz(n));
        System.out.println("Perfect: " + isPerfect(n, f));
        System.out.println("Abundant: " + isAbundant(n, f));
        System.out.println("Deficient: " + isDeficient(n, f));
        System.out.println("Strong: " + isStrong(d, n));
    }
}
