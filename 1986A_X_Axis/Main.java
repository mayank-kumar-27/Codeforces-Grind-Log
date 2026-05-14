import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int m = (a + b + c) - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));
            System.out.println(Math.abs(a - m) + Math.abs(b - m) + Math.abs(c - m));
        }
        sc.close();
    }
}