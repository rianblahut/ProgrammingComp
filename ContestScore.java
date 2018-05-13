package contestscore;

import java.util.*;

public class ContestScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		//populates new array with problem times
		int[] problems = new int[n];
		for (int i = 0; i < n; i++) {
			problems[i] = sc.nextInt();
		}
		sc.close();
		
		int time = 0;
		int farthestRead = k-1;
		int opsDone = 0;
		
		for (int i = 0; i <= n-k; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			//find the minimum time in this set
			for (int j = 0; j <= farthestRead; j++) {
				System.out.print(j + ": " + problems[j]);
				if (problems[j] < min) {
					min = problems[j];
					minIndex = j;
				}
				System.out.println(", Min is " + min + ", index is " + minIndex);
			}
			time +=  min;
			System.out.println("Time: " + time);
			problems[minIndex] = Integer.MAX_VALUE;
			farthestRead++;
			System.out.println("Farthest is " + farthestRead);
			opsDone++;
		}
		System.out.println("We've got through all the problems...");
		for (int i = 0; i < n - opsDone; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int j = 0; j < n; j++) {
				System.out.print(j + ": " + problems[j]);
				if (problems[j] < min) {
					min = problems[j];
					minIndex = j;
				}
				System.out.println(", Min is " + min + ", index is " + minIndex);
			}
			time +=  min;
			System.out.println("Time: " + time);
			problems[minIndex] = Integer.MAX_VALUE;
		}
		System.out.println(time);
	}
}