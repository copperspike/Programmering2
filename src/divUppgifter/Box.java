package divUppgifter;

import java.util.ArrayList;

public class Box {

	public ArrayList<Object> a = new ArrayList<Object>();

	public Box() {

	}

	public <E> void add(E e) {
		a.add(e);
	}

	public Object get(int i) {
		return a.get(i);
	}

	public <E1, E2> boolean compare(E1 e1, E2 e2) {

		if (e1.getClass() == e2.getClass()) {
			return true;
		} else {
			return false;
		}

	}

}
