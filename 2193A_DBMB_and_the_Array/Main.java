import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), s = sc.nextInt(), x = sc.nextInt(), m = 0;
            for (int i = 0; i < n; i++) m += sc.nextInt();
            System.out.println(m <= s && (s - m) % x == 0 ? "YES" : "NO");
        }
        sc.close();
    }
}