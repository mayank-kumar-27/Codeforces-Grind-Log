import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int d1 = Math.abs(a - 1);
            int d2 = Math.abs(b - c) + Math.abs(c - 1);
            if (d1 < d2) System.out.println(1);
            else if (d1 > d2) System.out.println(2);
            else System.out.println(3);
        }
        sc.close();
    }
}