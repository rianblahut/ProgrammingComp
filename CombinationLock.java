package combinationlock;


import java.util.Scanner;

public class CombinationLock {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            int p = sc.nextInt();
            //System.out.print("p: " + p + " ");
            int c1 = sc.nextInt();
            //System.out.print("c1: " + c1 + " ");
            int c2 = sc.nextInt();
            //System.out.print("c2: " + c2 + " ");
            int c3 = sc.nextInt();
            //System.out.print("c3: " + c3 + " ");
            //System.out.println("");
            
            if (p + c1 + c2 + c3 == 0) break;
            
            int total = 0;
            
            //first turn
            double current = (360 + 360 + 360 * (p-c1+40)/40);
            //System.out.println("First turn: " + current);
            total += current;
            
            //second turn
            current = (360 + 360*(c2-c1+40)/40);
            //System.out.println("Second turn: " + current);
            total += current;
            
            //third turn
            current = 360*(c2-c3+40)/40;
            //System.out.println("Third turn: " + current);
            total += current;
            
            System.out.println(total);
            
        }

    }
}
