import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            long p = Math.min(2L * b, c);
            long n = (a / 2) * p + (a % 2) * b;
            System.out.println(n);
        }
        sc.close();
    }
}