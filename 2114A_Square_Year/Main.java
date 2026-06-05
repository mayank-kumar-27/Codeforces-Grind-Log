import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = Integer.parseInt(s);
            int r = (int) Math.sqrt(n);
            if (r * r == n) System.out.println("0 " + r);
            else System.out.println("-1");
        }
        sc.close();
    }
}