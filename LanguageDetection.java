package languagedetection;

import java.util.Scanner;

public class LanguageDetection {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        
        while (true) {
         
            String s = sc.nextLine();
            if (s.equals("#")) break;
            
            if (s.equals("HELLO")) System.out.println("Case " + counter + ": ENGLISH");
            else if (s.equals("HOLA")) System.out.println("Case " + counter + ": SPANISH");
            else if (s.equals("HALLO")) System.out.println("Case " + counter + ": GERMAN");
            else if (s.equals("BONJOUR")) System.out.println("Case " + counter + ": FRENCH");
            else if (s.equals("CIAO")) System.out.println("Case " + counter + ": ITALIAN");
            else if (s.equals("ZDRAVSTVUJTE")) System.out.println("Case " + counter + ": RUSSIAN");
            else System.out.println("Case " + counter + ": UNKNOWN");
            
            counter++;
            
        }

    }
}
