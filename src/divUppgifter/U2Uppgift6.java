package divUppgifter;

import java.util.ArrayList;

public class U2Uppgift6 {

	private static ArrayList<String> a = new ArrayList<String>();
	
	public static void main(String[] args) {
		String s = "abc";
		char[] set = s.toCharArray();
		anagrams(set, 0);
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
	
	private static void anagrams(char[] set, int i){
		
		if (i != set.length - 1) {
		
			for (int j = i; j < set.length; j++) {
				
				a.add(set.toString());
				char temp = set[j];
				set[j] = set[i];
				set[i] = temp;
				
			}
			
			anagrams(set, i + 1);
			
		}
		
	}

}
