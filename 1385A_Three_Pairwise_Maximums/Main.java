import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] a = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
            java.util.Arrays.sort(a);
            if (a[1] != a[2]) System.out.println("NO");
            else {
                System.out.println("YES");
                System.out.println(a[0] + " " + a[0] + " " + a[2]);
            }
        }
        sc.close();
    }
}