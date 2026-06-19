import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = 0;
            while (n-- > 0) m = Math.max(m, sc.nextInt());
            System.out.println(m);
        }
        sc.close();
    }
}