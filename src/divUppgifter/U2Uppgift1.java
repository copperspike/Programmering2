package divUppgifter;

import java.util.Scanner;

public class U2Uppgift1 {

	public static void main(String[] args) {
		
		System.out.println("Skriv '0' n�r du har skrivit alla tal som ska summeras");
		
		Scanner sc = new Scanner(System.in);
		int s = 0;

		while (true) {

			int temp = sc.nextInt();
			if (temp == 0) {
				break;
			}
			s += temp;
			
		}

		System.out.println(s);
		sc.close();
		
	}

}