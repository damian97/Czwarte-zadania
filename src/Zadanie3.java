import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
	
		Scanner odczyt = new Scanner(System.in);
		
		String ciag_znakow = odczyt.nextLine();
		
		StringBuilder znakow_ciag = new StringBuilder().append(ciag_znakow).reverse();
		String znakow_ciag1 = new StringBuilder().append(znakow_ciag).toString();
		
		if (ciag_znakow.equalsIgnoreCase(znakow_ciag1)) {
			
			System.out.println("Wyraz jest palindromem");	
			
		}else {
			
			System.out.println("Wyraz nie jest palindromem");	
			
		}
		
		
		

	
		
		
		
	}
		
}