import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
	
		Scanner odczyt = new Scanner(System.in);
		
		String ciag_znakow = odczyt.nextLine();
		
		StringBuilder znakow_ciag = new StringBuilder().append(ciag_znakow).reverse();
		int i=0,j=ciag_znakow.length();
		
		System.out.println(znakow_ciag);	
		String ostatni_string ="";
		
		
		
		while(i<=ciag_znakow.length()) {
			
			char pierwszy = ciag_znakow.charAt(i);
			String pierwszy_string = Character.toString(pierwszy);
			char ostatni = ciag_znakow.charAt(j);
			ostatni_string = Character.toString(ostatni);
			
			if (pierwszy_string.equalsIgnoreCase(ostatni_string)) {
				
				
				System.out.println("Dziala");
				
				
			}
			
			
			i++;
			j--;
		
		}
		
		//dsdsdsdsd
		
		
		
		
		
	}
		
}