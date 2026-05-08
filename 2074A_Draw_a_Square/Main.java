import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt(), d = sc.nextInt(), u = sc.nextInt();
            boolean is = false;
            if (l == r && r == u && u == d) is = true;
            System.out.println(is ? "YES" : "NO");
        }
        sc.close();
    }
}