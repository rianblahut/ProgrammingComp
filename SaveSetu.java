package savesetu;

import java.util.Scanner;

public class SaveSetu {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        sc.nextLine();
        
        int total = 0;
        
        for (int i = 0; i < t; i++) {
            
            String line = sc.nextLine();
            //System.out.println(i + line);
            
            if (line.equals("report")) System.out.println(total);
            else {
                String number = line.substring(7);
                int donation = Integer.parseInt(number);
                total += donation;
            }
        }

    }
}
