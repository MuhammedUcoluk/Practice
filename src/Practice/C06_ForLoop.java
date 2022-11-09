package Practice;

import java.util.Scanner;

@SuppressWarnings("unused")
public class C06_ForLoop {

	public static void main(String[] args) {
		// iç içe for döngüsü ile çarpım tablosu oluşturun.
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+ " X " + j + " = " + (i*j));
				
			}
		}
		
	}

}
