package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	
	public static long dp[][];
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new long[n+1][10];
        long sum = 0;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < 10; j++) {
            	if(i == 1) {
            		dp[i][j] = 1;
            	}else{
            		if(i == 2) {
            			dp[i][j] += j;
        			}else {
                		for(int k = 0; k <= j; k++) {
                    		dp[i][j] += dp[i-1][k];
                			dp[i][j] = dp[i][j] % 10007;
                		}        				
        			}

            	}
            	
        		sum += dp[i][j];
            }
       }
        
        System.out.println(sum % 10007);
        
    }
   
}