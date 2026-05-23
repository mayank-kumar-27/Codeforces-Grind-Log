import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long m = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
            long as = Math.min(a, m), bs = Math.min(b, m);
            long rs = 2 * m - as - bs;
            long cs = Math.min(c, rs);
            long r = as + bs + cs;
            System.out.println(r);
        }
        sc.close();
    }
}