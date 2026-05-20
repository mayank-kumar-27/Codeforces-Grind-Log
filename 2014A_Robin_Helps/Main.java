import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int r = 0, h = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a >= k) r += a;
                else if (a == 0 && r > 0) { r--; h++; }
            }
            System.out.println(h);
        }
        sc.close();
    }
}