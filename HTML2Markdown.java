// ishaanjav

import java.util.Scanner;

public class HTML_2_Markdown {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		text = text.replaceAll("<b>", "**");
		text = text.replaceAll("</b>", "**");
		text = text.replaceAll("<i>", "*");
		text = text.replaceAll("</i>", "*");
		System.out.println(text);
	}
}
