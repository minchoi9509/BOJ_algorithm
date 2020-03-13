package algorithm;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int[] month_arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day_arr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int month = sc.nextInt();
        int date = sc.nextInt();
        
        int tot = date;
        for(int i = 0; i < month-1; i++) {
        	tot += month_arr[i]; 
        }
        
        System.out.println(day_arr[tot % 7]);
    }

}

 