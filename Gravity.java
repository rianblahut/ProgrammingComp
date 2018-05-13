package gravity;

import java.util.*;

public class Gravity {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		sc.nextLine();
		
		//grid setup
		char[][] grid = new char[rows][columns];
		for (int i = 0; i < rows; i++) {
			String current = sc.nextLine();
			for (int j = 0; j < columns; j++) {
				grid[i][j] = current.charAt(j);
				//System.out.print(grid[i][j]);
			}
			//System.out.println("");
		}
		//System.out.println("");
		sc.close();
		
		//gravity starts
		while(true) {
			int changesThisRound = 0;
			for (int i = 0; i < rows-1; i++) {
				for (int j = 0; j < columns; j++) {
					if (grid[i][j] == 'o' && grid[i+1][j] == '.') {
						grid[i][j] = '.';
						grid[i+1][j] = 'o';
						changesThisRound++;
					}
				}
			}
			if (changesThisRound == 0) break;
			
			//System.out.println("");
		}
		
		//printing final state
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println("");
		}
	}
}