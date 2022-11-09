package Practice;

import java.util.Scanner;

public class C09_ForLoop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un 
		//kati olan sayilari yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 100 den küçük bir tamsayı giriniz.");
		double num=scan.nextDouble();
		int sayı=(int) num;
		 // Sayı negatifse veya tamsayı değilse uyarı verelim.
		
		if (sayı<0) {
			System.out.println("lütfen pozitif bir tamsayı giriniz.");
		
		}else if(sayı!=num) {
			System.out.println("lütfen tam bir sayı giriniz");
		}else if(sayı>100){
			System.out.println("lütfen 100 den küçük bir sayı giriniz.");
			
		}else {
			for (int i = 0; i < num; i++) {
				if (i%3==0) {
					System.out.println(i+ " ");
				}
				
			}
			
			
		}
	}

}
