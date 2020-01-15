package gymnasieArbete;

import java.util.ArrayList;
import java.util.Scanner;

public class Import {
	public ArrayList<ArrayList<String>> getSheet() {
		return sheet;
	}

	public void clearSheet() {
		sheet.clear();
	}

	private ArrayList<ArrayList<String>> sheet = new ArrayList<ArrayList<String>>();

	/**
	 * loc is the location of the .csv file that is to be imported
	 * target is which part of the spreadsheet that is supposed to be imported,
	 * target == 0 targets the data points, and the minimum value, maximum value and the data type of those data points
	 * target == 1 targets the objects
	 *
	 * @param loc
	 * @param target
	 */
	public Import(String loc, boolean target) {

		clearSheet();
		Scanner sc = new Scanner(loc);

		if (!target) {
			while (sc.hasNextLine()) {
				ArrayList<String> out = new ArrayList<String>();
				String[] temp = sc.nextLine().split(";", 4);

				for (String in: temp) {
					out.add(in);
				}
				
				sheet.add(out);
			}
		} else {
			int index = 0;
			while (sc.hasNextLine()) {
				ArrayList<ArrayList<String>> objectArray = new ArrayList<ArrayList<String>>();
				String[] temp = sc.nextLine().split(";");
				


			}
		}


		sc.close();
	}
}
