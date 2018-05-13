package server;

// Practice contest 9/14

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int timeLimit = s.nextInt();
        
        int numTasks = 0;
        int runTime = 0;
        
        for (int i = 0; i < n; i++) {
            int task = s.nextInt();
            runTime += task;
            if (runTime <= timeLimit) numTasks++;
        }
        
        System.out.println(numTasks);

    }
}
