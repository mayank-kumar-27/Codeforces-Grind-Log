import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
            long u = d - b;
            if (u < 0 || a + u < c) System.out.println(-1);
            else System.out.println(u + (a + u - c));
        }
        sc.close();
    }
}