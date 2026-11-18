import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt();
            int tl = r - l + 1;
            int k;
            if (l > 0 || r < 0) k = 1;
            else {
                int m = Math.min(-l, r);
                k = 2 * m + 1;
                if (-l != r) k++;
            } System.out.println(tl - k);
        }
        sc.close();
    }
}
