package plantingtrees;

/**
 * Practice Contest 2
 */
import java.util.Arrays;
import java.util.Scanner;

public class PlantingTrees {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int party = 0;
        int treeLine[] = new int[N];

        
        
        for (int i = 0; i < N; i++) {
            treeLine[i] = sc.nextInt();
        }
        Arrays.sort(treeLine);
        int treeLine2[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            treeLine2[i] = treeLine[treeLine.length-i-1];
            //System.out.println(treeLine2[i]);
        }
        
        for (int i = 1; i <= N; i++) {
            
            int grow = i + treeLine2[i-1];
            //System.out.println("grown date: " + grow);
            if (grow > party) party = grow;
        }
         
        System.out.println(party+1);
         
    }
}
