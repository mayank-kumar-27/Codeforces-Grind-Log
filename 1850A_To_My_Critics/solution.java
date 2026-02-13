import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = -1;
        while (++i < n) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a + b >= 10 || a + c >= 10 || b + c >= 10) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
