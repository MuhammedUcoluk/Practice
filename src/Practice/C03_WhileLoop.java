package Practice;

public class C03_WhileLoop {

	public static void main(String[] args) {
		// Sonsuza kadar çalışacak bir loop oluşturalım. 
		// 100 kere çalıştığında break yapalım ve loop dursun.
		
		int sayı=0;
		
		while (true) {
			
			
			System.out.println(sayı);
			if (sayı>98) {
				break;
				
			}
			sayı++;
			
		}
		System.out.println("100 kez çalıştı :)");
	}

}
