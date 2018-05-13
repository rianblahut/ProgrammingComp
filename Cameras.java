package cameras;

import java.util.*;

public class Cameras {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int houses = sc.nextInt();
		int camerasInstalled = sc.nextInt();
		int rangeOfHouses = sc.nextInt();
		
		//initialize street of houses all without cameras
		boolean[] street = new boolean[houses];
		for (int i = 0; i < street.length; i++) {
			street[i] = false;
		}
		
		//sets appropriate houses to have cameras
		for (int i = 0; i < camerasInstalled; i++) {
			int cam = sc.nextInt();
			street[cam-1] = true;
		}
		
		sc.close();
		
		//boolean done = false;
		int camsToAdd = 0;
		int currentHouse = 0;
		while (true) {
			int camsThisRange = 0;
			for (int i = 1; i <= rangeOfHouses; i++) {
				if (currentHouse > houses - 1) break;
				if (street[currentHouse] == true) camsThisRange++;
				currentHouse++;
				//System.out.println("current house: "+ currentHouse);
			}
			if (camsThisRange == 1) camsToAdd += 1;
			else if (camsThisRange == 0) camsToAdd += 2;
			if (currentHouse >= houses) break;
		}
		System.out.println(camsToAdd);
	}
}