package Practice;

import java.util.Scanner;

public class C10_ForLoop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un 
		//veya 5”in kati olan sayilari yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 100 den küçük bir tamsayı giriniz.");
		double num=scan.nextDouble();
		int sayı=(int) num;
		
		if (num<0) {
			System.out.println("lütfen pozitif bir tamsayı giriniz.");
		}else if(sayı!=num) {
			System.out.println("Lütfen bir tamsayı giriniz.");
		}else if(num>100) {
			System.out.println("Lütfen 100 den küçük bir tamsayı giriniz.");
		
			
		}else {
			for (int i = 1; i < num; i++) {
				if (i%3==0 || i%5==0) {     // 3 veya 5 in katını yazdı. && yapsaydık sadece 3 ve 5 e bölünenleri verecekti.
					System.out.print(i + " ");
				}
				
			}
	}
	}

}
