package divUppgifter;

public class ClassTest {

	public static void main(String[] args) {

		Box a = new Box();
		Integer i = 5;
		Integer j = 9;
		String s = "C17H21NO4";

		a.add(i);
		a.add(j);
		a.add(s);

		System.out.println(a.compare(a.get(0), a.get(1)));
		System.out.println(a.compare(a.get(0), a.get(2)));

	}

}
