package divUppgifter;

import java.util.ArrayList;
import java.util.Scanner;

public class Primtal {

	public static ArrayList<Integer> Primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		Primes.add(0, 2);
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
//		
//		
//		if (Primes.contains(p)) {
//			return true;
//		}
//
//		for (int i = 3; i <= p; i++) {
//
//			if (!Primes.contains(i)) {
//
//				for (int j = 0; j < Primes.size(); j++) {
//
//					if (i % Primes.get(j) == 0) {
//
//						break;
//
//					} else {
//
//						Primes.add(i);
//
//					}
//
//				}
//
//			}
//
//		}
//
//		if (Primes.contains(p)) {
//			return true;
//		} else {
//			return false;
//		}

	}

}
