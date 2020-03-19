package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class Main{
	
	public static int[] dp; 
	
	public static int cal(int n) {
		if(n == 0 || n == 1) {
			dp[n] = 1;
			return 1;
		}
		
		if(n == 2) {
			dp[n] = 2;
			return 2;
		}
		
		if(dp[n] > 0) {
			return dp[n]; 
		}
		
		dp[n] = cal(n-3) + cal(n-2) + cal(n-1); 
		return dp[n]; 
	}
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
        	int s = sc.nextInt();
            dp = new int[s+1]; 
            System.out.println(cal(s));

        }        
    }

}