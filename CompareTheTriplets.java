import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int alice[] = new int[3];
        // or int alice[] = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int bob[] = new int[3];
        // read input into arrays
        for(int i = 0; i < 3; i ++)
            alice[i] = sc.nextInt();
        for(int i = 0; i < 3; i ++)
            bob[i] = sc.nextInt();
        
        int a = 0, b = 0; // keep track of scores
        for(int i = 0; i < 3; i++){
            // alice got a higher score
            if(alice[i] > bob[i])
                a++;
            //bob got a better score
            if(bob[i] > alice[i])
                b++;
        }
        System.out.println(a + " " + b);
    }
}
