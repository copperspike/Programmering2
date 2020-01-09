package gymnasieArbete;

import java.util.ArrayList;
import java.util.Scanner;

public class Import {
	public ArrayList<String[]> getSheet() {
		return sheet;
	}

	private ArrayList<String[]> sheet = new ArrayList<String[]>();

	public Import(String loc) {
		Scanner sc = new Scanner(loc);

		int index = 0;
		while (sc.hasNextLine()) {
			sheet.add(sc.nextLine().split(";"));

			index++;
		}

		sc.close();
	}
}
