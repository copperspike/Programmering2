package gymnasieArbete;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<ArrayList<String>> dataArray = new Import("C:/Users/usr/Documents/GitHub/Programmering2/src/gymnasieArbete/spreadsheetTemplate.csv", false).getSheet();
		ArrayList<ArrayList<String>> objectArray = new Import("C:/Users/usr/Documents/GitHub/Programmering2/src/gymnasieArbete/spreadsheetTemplate.csv", true).getSheet();

		for (int i = 0; i < dataArray.size(); i++) {
			ArrayList<String> dataPoint = dataArray.get(i);

			for (int j = 0; j < dataPoint.size(); j++) {
				String dataValue = dataPoint.get(j);

				System.out.print(dataValue + "    ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < objectArray.size(); i++) {
			ArrayList<String> object = objectArray.get(i);

			for (int j = 0; j < object.size(); j++) {
				String objectValue = object.get(j);

				System.out.print(objectValue + "    ");
			}
			System.out.println();
		}

	}

}
