package Practice;

import java.util.Scanner;

public class UcakBileti {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen Gidilecek mesafeyi Km olarak giriniz.");
		int km = scan.nextInt();
		if (km<0) {
			System.out.println("Hatalı giriş yaptınız");
		}	else {
				
			
		

		
		System.out.println("Lütfen yaşınızı giriniz. ");
		int yas=scan.nextInt();
		if (yas<0) {
			System.out.println("Hatalı giriş yaptınız");
		}else {
				
			
		
		
		System.out.println("Lütfen tek yön yolculuk için 1 i , gidiş dönüş için 2 yi tuşlayınız.");
		
		int yolculuktipi=scan.nextInt();
		if (yolculuktipi==1) {
			System.out.println("Yanlızca gidiş yönü");
		
		} else if (yolculuktipi==2) {
			System.out.println("Gidiş Dönüş Yolculuk");
		}
		else {
			System.out.println("Hatalı giriş yaptınız");
		}
		
		Double toplamTutar=km*0.10;
		System.out.println("İndirimsiz Toplam Tutar : " + toplamTutar);
	
		if (yas<12) {
			
			System.out.println("İndirimli yeni Tutar : " + toplamTutar/2);
		} else if (yas>=12 && yas<=24){
			System.out.println("İndirimli yeni Tutar : " + (toplamTutar=toplamTutar-toplamTutar*0.10));
		}else if (yas>65) {
			System.out.println("İndirimli Yeni Tutar : " + (toplamTutar=toplamTutar-toplamTutar*0.30));
		}else if (yolculuktipi==2 ) {
			System.out.println("İndirimli Yeni Tutar : " + (toplamTutar=toplamTutar-toplamTutar*0.20));
		}
	}
		}}}
