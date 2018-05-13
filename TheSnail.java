import java.util.Scanner;

public class TheSnail {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int heightOfWell = sc.nextInt();
			int climb = sc.nextInt();
			int slide = sc.nextInt();
			int fatigue = sc.nextInt();
			int day = 1;
			boolean success = false;
			boolean failure = false;
			double currentPosition = 0;
			
			if (heightOfWell == 0) {
				sc.close();
				break;
			}
			
			while (success == false && failure == false) {
				//day
				System.out.println("Day " + day);
				double todayClimb = climb - (double)(climb*((double)fatigue/100))*(day-1);
				if (todayClimb <= 0) todayClimb = 0;
				System.out.println("Today's Climb: " + todayClimb);
				currentPosition += todayClimb;
				System.out.println("Current position: " + currentPosition);
				if (currentPosition >= heightOfWell) {
					success = true;
					break;
				}
				
				//night
				currentPosition -= slide;
				System.out.println("Distance Slid: " + slide);
				System.out.println("Current position: " + currentPosition);
				if (currentPosition <= 0) {
					failure = true;
					break;
				}
				day++;
			}
			if (success == true && failure == false) {
				System.out.println("success on day " + day);
			}
			else if (success == false && failure == true) {
				System.out.println("failure on day " + day);
			}
			
			
		}
		
	}

}
