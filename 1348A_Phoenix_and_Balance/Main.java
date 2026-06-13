import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), a = 1 << n, b = 0;
            for (int i = 1; i < n; i++) {
                if (i < n / 2) a += (1 << i);
                else b += (1 << i);
            }
            System.out.println(Math.abs(a - b));
        }
        sc.close();
    }
}