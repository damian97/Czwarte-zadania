import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
	
		Scanner odczyt = new Scanner(System.in);
		
		String ciag = odczyt.nextLine();
	
		StringBuilder sb = new StringBuilder().append(ciag).reverse();
		
		System.out.println(sb);
		
	}
		
}