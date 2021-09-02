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
        int size = sc.nextInt();
        for(int row = 0; row < size; row++){
            for(int space = 0; space < size - row - 1; space ++)
                System.out.print(" ");
            for(int pound = 0; pound < row + 1; pound++)
                System.out.print("#");
            System.out.println();
        }
    }
}
