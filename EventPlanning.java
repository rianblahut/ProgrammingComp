package eventplanning;

import java.util.Scanner;

public class EventPlanning {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        while (sc.hasNext()) {
            
            int participants = sc.nextInt();
            
            int budget = sc.nextInt();
            int numHotels = sc.nextInt();
            int weeks = sc.nextInt();
            
            int cheapest = Integer.MAX_VALUE;
            
            for (int i = 0; i < numHotels; i++) {
                int cost = sc.nextInt();
                boolean roomsAvailable = false;
                for (int j = 0; j < weeks; j++) {
                    int specificWeek = sc.nextInt();
                    if (specificWeek >= participants) roomsAvailable = true;
                }
                if (roomsAvailable == true) {
                    int totalCost = cost * participants;
                    if (totalCost < cheapest) cheapest = totalCost;
                }
            }
            if (cheapest > budget) System.out.println("stay home");
            else System.out.println(cheapest);
            
            
            //FIND A WAY TO BREAK THE LOOP!!
            if (!sc.hasNextInt()) {
                System.exit(0);
            }

        }
    }
}
