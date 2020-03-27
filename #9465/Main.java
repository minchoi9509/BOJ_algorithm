package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	
	
    public static void main(String args[])throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int[][] dp = null;
    	int[][] sticker = null;
    	int su = 0;
    	
        int n = Integer.parseInt(br.readLine()); // 테스트 케이스 숫자
        for(int i = 1; i <= n; i++) {
        	
            su = Integer.parseInt(br.readLine());
            dp = new int[2][su+1]; // 점화식 실행할 배열
            sticker = new int[2][su+1]; // 받은 숫자 저장해 놓을 배열
            
            String[] first_line = br.readLine().split(" ");
            String[] second_line = br.readLine().split(" ");
           
            // sticker 배열에 값 저장
        	for(int j = 0; j < su; j++) {
        		sticker[0][j+1] = Integer.parseInt(first_line[j]);
        		sticker[1][j+1] = Integer.parseInt(second_line[j]);
        	}
        	
        	// dp 첫번째 행 초기화
        	dp[0][1] = sticker[0][1];
        	dp[1][1] = sticker[1][1]; 
        	
        	for(int k = 2; k <= su; k++) {
        		dp[0][k] = Math.max(dp[1][k-1], dp[1][k-2]) + sticker[0][k]; 
        		dp[1][k] = Math.max(dp[0][k-1], dp[0][k-2]) + sticker[1][k]; 
        	}

            System.out.println(Math.max(dp[0][su], dp[1][su]));
            
        }
        

    }
   
}