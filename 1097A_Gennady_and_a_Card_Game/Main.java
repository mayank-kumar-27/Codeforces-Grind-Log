import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.next();
        char tr = tc.charAt(0);
        char ts = tc.charAt(1);
        
        boolean c = false;
        for (int i = 0; i < 5; i++) {
            String hc = sc.next();
            char hr = hc.charAt(0);
            char hs = hc.charAt(1);
            if (hr == tr || hs == ts) c = true;
        }
        System.out.println(c?"YES":"NO");
        sc.close();
    }
}