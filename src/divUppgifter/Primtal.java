package divUppgifter;

import java.util.Scanner;

public class Primtal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s;

		while (true) {

			s = sc.nextInt();
			if (s == 0) {
				break;
			}
			System.out.println(primeCheck(s));
			
		}

		sc.close();

	}

	public static boolean primeCheck(int p) {
		if(p%2 == 0)
			return false;
		for (int i = 3; i < Math.sqrt(p)+1; i+=2) {
			if(p%i==0) {
				return false;
			}		
		}
		
		return true;
		
	}

}
