package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class Main{
	
	public static int[] DP; 
	
	public static int topDown (int n) {
	    if (n == 0) {
	        DP[0] = 1;
	    }
	    if (n == 1) {
	        DP[1] = 1;
	    }
	    if (n == 2) {
	        DP[2] = 2;
	    }
	    if (n >= 3) {
	        DP[n] = topDown(n-1) + topDown(n-2) + topDown(n-3);
	    }
	    return DP[n];
	}
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DP = new int[n+1]; 
        System.out.println(topDown(n));
        
    }

}