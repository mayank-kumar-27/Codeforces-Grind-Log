import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        int D = 0, A = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') D++;
            else if (s.charAt(i) == 'A') A++;
        }

        if (D > A) System.out.println("Danik");
        else if (A > D) System.out.println("Anton");
        else System.out.println("Friendship");
        sc.close();
    }
}
