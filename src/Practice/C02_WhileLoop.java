package Practice;

import java.util.Scanner;

public class C02_WhileLoop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Kullanıcıdan istenen sayının rakamlarını toplayan bir program.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen en az 2 basamaklı bir sayı giriniz.");
		int sayı=scan.nextInt();
		
		int basamak=0;
		int toplam=0;
		
		
		
		while (sayı>0) {
			basamak=sayı%10;
			toplam+=basamak;
			sayı/=10;
			
		}
		System.out.println("Girilen sayının rakamları toplamı : " + toplam);
	}

}
