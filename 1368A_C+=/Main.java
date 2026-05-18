import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong(), n = sc.nextLong();
            int o = 0;
            while (Math.max(a, b) <= n) {
                if (a < b) a += b;
                else b += a;
                o++;
            }
            System.out.println(o);
        }
        sc.close();
    }
}