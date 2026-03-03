import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), arr[] = new int[t];

        for (int i = 0; i < t; i++) arr[i] = sc.nextInt();
        int m = arr[0], n = arr[0], c = 0;

        for (int i = 1; i < t; i++) if (arr[i] > m) { c++; m = arr[i]; } else if (arr[i] < n) { c++; n = arr[i]; }
        System.out.println(c);
        sc.close();
    }
}