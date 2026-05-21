import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long w = sc.nextLong(), h = sc.nextLong(), n = sc.nextLong(), p = 1;
            while (w % 2 == 0) {
                p *= 2;
                w /= 2;
            }
            while (h % 2 == 0) {
                p *= 2;
                h /= 2;
            }
            System.out.println(p >= n ? "YES" : "NO");
        }
        sc.close();
    }
}