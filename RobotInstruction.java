package robotinstruction;

import java.util.Scanner;

public class RobotInstruction {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		//System.out.println(t);
		int p = 0;
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			//System.out.println(n);
			int[] instructions = new int[n];
			sc.nextLine();
			
			for (int j = 0; j < n; j++) {
				String current = sc.nextLine();
				//System.out.println(current);
				if (current.equals("RIGHT")) {
					p++;
					instructions[j] = 1;
				}
				else if (current.equals("LEFT")) {
					p--;
					instructions[j] = -1;
				}
				else if (current.matches("SAME AS [0-9]+")) {
					int sameAs = Integer.parseInt(current.substring(8));
					instructions[j] = instructions[sameAs-1];
					p += instructions[sameAs-1];
				}
				else System.out.println("ERROR: " + current);
				
			}
			System.out.println(p);
			p = 0;
		}
		sc.close();
		
	}

}
