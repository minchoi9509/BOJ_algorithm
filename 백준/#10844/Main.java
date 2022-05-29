package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long dp[][] = new long[n+1][10];
        long mod = 1000000000;
        for (int i = 1; i <= 9; i++){
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++){
            for (int j = 0; j <= 9; j++){
                dp[i][j] = 0;
                if (j >= 1){
                    dp[i][j] += dp[i-1][j-1];
                }
                if (j <= 8){
                    dp[i][j] += dp[i-1][j+1];
                }
                dp[i][j] %= mod;
            }
        }
        long ans = 0;
        for (int i = 0; i <= 9; i++){
            ans += dp[n][i];
        }
        ans %= mod;
        System.out.println(ans);
    }
}