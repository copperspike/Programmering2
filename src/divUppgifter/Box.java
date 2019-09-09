package divUppgifter;

import java.util.ArrayList;

public class Box {
	
	public ArrayList<Object> a = new ArrayList<Object>();
	
	public Box() {
		
	}
	
	public <E> void add(E e) {
		a.add(e);
	}
	
}
