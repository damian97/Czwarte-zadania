import java.util.Scanner;

public class Zadanie6 {

	public static void main(String[] args) {
		
	Scanner odczyt = new Scanner(System.in);

	//String alfabet_Znak[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	//String alfabet_DEC[] = {97,98,99,"100,...,120,121,122};
	
	
	System.out.print("Podaj ³añcuch znaków do zaszyfrowania:");
	String lancuch = odczyt.nextLine();
	System.out.print("Podaj przesuniêcie:");
	int przesuniecie = odczyt.nextInt();
	
	int dlugosc = lancuch.length();
	char znak;
	int znak_ascii;
	
	
	
	System.out.print("Zaszyfrowany tekst:");
	for (int i=0; i<dlugosc; i++) {
		
		znak = lancuch.charAt(i);
		znak_ascii = znak+przesuniecie;
		
		if (znak_ascii > 122) {
			
			znak_ascii = 97;
			znak_ascii = znak_ascii+1;
			System.out.print((char)znak_ascii);
			
		}else {
		
		System.out.print((char)znak_ascii);
		
		}
		
		
	}
	
	
	
	}
	
}
