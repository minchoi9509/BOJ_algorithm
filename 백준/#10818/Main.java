package algorithm;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt(); 
        int min = 1000000, max = -1000000; 
        int a = 0;
       
        
        for(int i = 0; i < n; i++) {
        	a = sc.nextInt();
    
        	if(a < min) {
        		min = a;
        	}
        	
        	if(a > max) {
        		max = a; 
        	}
        }
        
        System.out.println(min + " " + max);
    }

}

 