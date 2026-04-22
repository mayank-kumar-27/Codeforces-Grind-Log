import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            ArrayList<Integer> b = new ArrayList<>();
            b.add(a[0]);
            for (int i = 1; i < n; i++) {
                if (a[i] >= a[i - 1]) b.add(a[i]);
                else {
                    b.add(1);
                    b.add(a[i]);
                }
            }
            out.append(b.size()).append('\n');
            for (int i = 0; i < b.size(); i++) {
                if (i > 0) out.append(' ');
                out.append(b.get(i));
            }
            out.append('\n');
        }
        System.out.print(out);
        sc.close();
    }
}