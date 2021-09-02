// ishaanjav

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Troll {
    public static void main(String[] args) throws FileNotFoundException {
    	// the optimal solution is to let the friend play the first level.
    	//   then you play all levels after that
    	// so the number of levels you lose is 1 if the first enemy is a troll, or 0 if not a troll.
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	System.out.println(sc.nextInt());
    }
}
