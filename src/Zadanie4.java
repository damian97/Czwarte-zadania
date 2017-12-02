import java.util.Scanner;


public class Zadanie4 {

	public static void main(String[] args) {

		Scanner odczyt = new Scanner(System.in);
		
		String zdanie = odczyt.nextLine();
		
		int znak, cyfra;
		char znak1;
		int suma = 0;
		int dlugosc = zdanie.length();
		
		for(int i = 0; i<dlugosc; i++) {
			
			znak = zdanie.charAt(i);
			znak1 = zdanie.charAt(i);
			String znaksb = new StringBuilder().append(znak1).toString();
			
			if (znak >=48 && znak <=57) {
				
				cyfra = Integer.parseInt(znaksb);
				suma= suma+cyfra;

			}
			
			

			
		}
		
		
		System.out.println(suma);

		
	
	
	}
	
}
