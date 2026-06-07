import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next();
            int c = 0, i = 0;
            while (i < n) {
                if (s.charAt(i) == 'B') { c++; i += k; } 
                else i++;
            }
            System.out.println(c);
        }
        sc.close();
    }
}