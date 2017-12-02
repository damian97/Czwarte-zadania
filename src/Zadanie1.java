import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {
	
		Scanner odczyt = new Scanner(System.in);
		
		String ciag = odczyt.nextLine();
		
		int licznik=1;
		int dlugosc = ciag.length()-1;

		char ostatnia = ciag.charAt(dlugosc);
		String ostatnias=Character.toString(ostatnia);
		
		
		for(int i=0; i<dlugosc; i++) { 
					
			char znak = ciag.charAt(i);
			String znaks=Character.toString(znak);
			
			
			
		if( znaks.equalsIgnoreCase(ostatnias) ) {
		
			
			
			licznik ++;
			
			
		}
			
		
			
		}
		
		
		
		System.out.println(licznik);
		
		
	
	}
		
}//