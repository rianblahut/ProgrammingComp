package barbells;

import java.util.*;



public class Barbells {
	
	public static int sumOfArray(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bars = sc.nextInt();
		int plates = sc.nextInt();
		
		int[] barArray = new int[bars];
		
		for (int i = 0; i < bars; i++) {
			barArray[i] = sc.nextInt();
		}
		int[] plateArray = new int[plates + 2];
		for (int i = 0; i < plates; i++) {
			plateArray[i] = sc.nextInt();
		}
		sc.close();
		plateArray[plates] = 0;
		plateArray[plates+1] = 0;
		
		int[] totalWeights = new int[plates*bars*2];
		int counter = 0;
		
		//loop for barbells
		for (int i = 0; i < bars; i++) {
			//loop for left side
			for (int j = 0; j < plates + 2; j++) {
				int[] leftSide = new int[plates+2];
				
				
				//loop for right side
				for (int k = 0; k < plates + 2; k++) {
					
					if (j != k) {
						int currentTest = barArray[i] + plateArray[j] + plateArray[k];
						
						
						boolean alreadyThere = false;
						for (int l = 0; l < totalWeights.length; l++) {
							if (totalWeights[l] == currentTest) alreadyThere = true;
						}
						if (alreadyThere == false) {
							totalWeights[counter] = currentTest;
							counter++;
						}
					}
				}
			}
		}
		//need to sort here
		Arrays.sort(totalWeights);
		for (int i = 0; i < counter; i++) {
			if (totalWeights[i] != 0) {
				System.out.println(totalWeights[i]);
			}
		}
	}
}