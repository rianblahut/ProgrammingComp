package alphabet;

import java.util.Scanner;

public class Alphabet {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		sc.close();
		
		int lcindex = -1;
		int lcascii = 97;
		while (lcindex == -1) {
			lcindex = line.indexOf((char)lcascii);
			if (lcindex == -1) lcascii++;
			else System.out.println("Lowest Char: " + (char)lcascii + " at " + lcindex);
		}

		
		int lettersToAdd = 0;
		int endIndex = line.length() - 1;
		if (lcascii > 97) lettersToAdd += (lcascii - 97);
		
		char[] workingArray = new char[26];
		workingArray[lcascii - 97] = 'a';
		
		//the below code ended up adding too much if the value of char went up then down then up
		
		for (int currentIndex = lcindex; currentIndex < endIndex; currentIndex++) {
			char currentChar = line.charAt(currentIndex);
			System.out.println("Current char is " + currentChar);

			if (currentIndex == endIndex) {
				System.out.println("it's the last one");
				if (currentChar < 'z') {
					lettersToAdd += ((int)'z' - (int)currentChar);
				}
				break;
			}
			int nextIndex = currentIndex + 1;
			System.out.println("Next index: " + nextIndex);
			char nextChar = line.charAt(nextIndex);
			System.out.println("Next char: " + nextChar);
			
			if (nextChar > (currentChar + 1)) {
				lettersToAdd += nextChar-currentChar-1;
			}
			
		}
		
		System.out.println(lettersToAdd);
		System.out.println();
		
	}
}