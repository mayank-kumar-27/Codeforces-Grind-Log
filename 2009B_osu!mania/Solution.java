import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int r = sc.nextInt();
            char[][] arr = new char[r][4];
            for (int i = 0; i < r; i++) {
                String s = sc.next();
                for (int j = 0; j < 4; j++) arr[i][j] = s.charAt(j);
            }
            for (int i = r - 1; i >= 0; i--) for (int j = 0; j < 4; j++)
            if (arr[i][j] == '#') System.out.print((j + 1) + " ");
            System.out.println();
        }
        sc.close();
    }
}