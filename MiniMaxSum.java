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
        long array[] = new long[5]; //read the input
        for(int i =0 ; i < 5; i++)
            array[i] = sc.nextInt();
        
        //sort the array
        Arrays.sort(array);
        long sum = 0; // get the sum
        for(int i = 0; i < array.length; i++) sum += array[i];
        
        // print answer
        System.out.println(sum - array[4] + " " + (sum - array[0]));
    }
}
