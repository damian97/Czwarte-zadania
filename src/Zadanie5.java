import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);
		
		String wyrazenie = odczyt.nextLine();
		
		int licznik=0;
		int nawias1, nawias2, znak;
		
		
		for(int i=0; i<wyrazenie.length(); i++) {
			
			znak = wyrazenie.charAt(i);
			
			if (znak==40) {
				
				licznik++;
				
			}else if (znak==41) {
				
				licznik--;
				
			}
			
		}
		

		if (licznik==0) {	
			System.out.println("OK");	
		}else {		
			System.out.println("B³êdne sparowanie nawiasów");
		}
		
	
	}
	
}
