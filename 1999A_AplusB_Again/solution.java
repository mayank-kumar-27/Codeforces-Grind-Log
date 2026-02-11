import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = -1;
        while (++i<n) {
            int num = sc.nextInt(), s = 0;
            while (num!= 0) {
                s += (num%10);
                num /=10;
            }
            System.out.println(s);
        }
        sc.close();
    }
}
