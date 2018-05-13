package equality;

import java.util.*;

public class Equality {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String problem = sc.nextLine();
		sc.close();

		int a = problem.charAt(0) - 48;
		int b = problem.charAt(4) - 48;
		int c = problem.charAt(8) - 48;
		//System.out.println(a + " + " + b + " = " + c);
		if (a + b == c) System.out.println("YES");
		else if (a + b != c) System.out.println("NO");
		
	}
}