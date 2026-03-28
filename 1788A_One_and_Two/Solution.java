import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), p = 0, s = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) { arr[i] = sc.nextInt(); if (arr[i] == 2) s++; }
            int r = -1;
            for (int i = 0; i < n; i++) { if (arr[i] == 2) p++; if (p == s - p) { r = i + 1; break; } }
            System.out.println(r);
        }
        sc.close();
    }
}