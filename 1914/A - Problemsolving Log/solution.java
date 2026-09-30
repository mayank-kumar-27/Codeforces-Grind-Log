import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
 
            int[] a = new int[26];
 
            for (char c : s.toCharArray())
                a[c - 'A']++;
 
            int ans = 0;
 
            for (int i = 0; i < 26; i++)
                if (a[i] >= i + 1)
                    ans++;
 
            System.out.println(ans);
        }
    }
}