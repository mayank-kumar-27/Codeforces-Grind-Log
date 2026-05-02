import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int e = 0, o = 0;
            for (int num : arr) if (num % 2 == 0) e += num; else o += num;
            System.out.println(e > o ? "YES" : "NO");
        }
        sc.close();
    }
}