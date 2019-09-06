package divUppgifter;

public class U2Uppgift3 {

	public static void main(String[] args) {
		Integer[] a = {1,2,3};
		Integer[] b = toGenericArray(a);
		
		System.out.println(a + " " + b);
	}
	
	public static <E> E[] toGenericArray(E[] e) {
		
		return e;
		
	}

}
