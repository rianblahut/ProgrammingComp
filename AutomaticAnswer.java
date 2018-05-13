package automaticanswer;

import java.util.Scanner;

public class AutomaticAnswer {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            
            int n = sc.nextInt();
            
            int r = (((n*567)/9 + 7492) * 235) /47 - 498;
            System.out.println(Math.abs((r%100 - r%10)/10));
            
        }

    }
}
