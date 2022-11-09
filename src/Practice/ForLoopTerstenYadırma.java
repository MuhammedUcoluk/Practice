package Practice;

import java.util.Scanner;

public class ForLoopTerstenYadırma {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Kullanıcıdan bir string isteyin ve tersten yazdıran bir program yazın.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen tersine çevirmek için bir kelime giriniz.");
		String kelime=scan.nextLine();
		
		for (int i = kelime.length()-1; i >= 0; i--) {
			System.out.print(kelime.substring(i,i+1));
			
		}
		
		 
	}

}
