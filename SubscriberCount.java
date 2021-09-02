//ishaanjav

import java.util.Scanner;
import java.io.IOException;

public class Subscriber {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int subscribers[] = new int[n];
		int days[] = new int[n];

		for (int i = 0; i < n; i++)
			subscribers[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			days[sc.nextInt() - 1] = i;

		for (int i = 1; i < n; i++) {
			int subChange = subscribers[days[i]] - subscribers[days[i - 1]];
			if (subChange > 0) System.out.print('+');
			System.out.println(subChange);
		}

	}
}
