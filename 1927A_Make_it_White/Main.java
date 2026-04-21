import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int i = 0, j = n - 1;
            while (s.charAt(i) != 'B') i++;
            while (s.charAt(j) != 'B') j--;
            System.out.println(j - i + 1);
        }
        sc.close();
    }
}