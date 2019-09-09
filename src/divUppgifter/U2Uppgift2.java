package divUppgifter;

import java.util.Scanner;

public class U2Uppgift2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(reverse(sc.nextLine()));

		sc.close();

	}

	public static String reverse(String s) {
		return reverse(s, 0);
	}

	public static String reverse(String s, int i) {
		if (i >= s.length()) {
			return s;
		}

		String temp = "";

		temp += s.substring(0, i);

		temp += s.charAt(s.length() - 1);

		temp += s.substring(i, s.length() - 1);

		return reverse(temp, i + 1);

	}

}
