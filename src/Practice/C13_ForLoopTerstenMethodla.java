package Practice;

import java.util.Scanner;

public class C13_ForLoopTerstenMethodla {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		//  Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren 
		//bir method yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen tersine çevirmek için bir kelime giriniz.");
		String kelime=scan.nextLine();
		
		tersineyazdır(kelime);
		
		System.out.println(tersineyazdır(kelime));
			
		}

	public static String tersineyazdır(String kelime) {
		String tersKelime="";
		for (int i = kelime.length()-1; i >= 0; i--) {
			 
			tersKelime+=kelime.substring(i, i+1);
		}
		
		
		
	
		
	return tersKelime;
	
}
}
