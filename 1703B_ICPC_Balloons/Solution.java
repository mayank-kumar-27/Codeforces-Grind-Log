import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] a = s.toCharArray();
            Arrays.sort(a);
            int r = 0;
            for (int i = 0;i<n;i++){
                char c = a[i];
                r +=2;
                while (a[i]==c){
                    r++;
                }
            }
        }
        sc.close();
    }
}