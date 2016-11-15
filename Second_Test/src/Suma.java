
public class Suma {

	public static int a, b;
	
	int [] numeros = {0, 1, 2, 3, 4, 5, 6};
	
	public static void main(String[] args) {
		
		a = (int)(Math.random() * 6 + 1);
		
		b = (int)(Math.random() * 6 + 1);
		
		System.out.println("Suma de a + b = " +  a + b);

	}

}
