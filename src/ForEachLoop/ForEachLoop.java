package ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		// Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each 
		//loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		
		List<Integer> sayı=new ArrayList<>();
		
		sayı.add(2);
		sayı.add(1);
		sayı.add(3);
		sayı.add(4);
		
		int sayıKaresi=0;
		
		
		for (Integer each : sayı) {
			sayıKaresi+=each*each;
			
			}
			
		System.out.println(sayıKaresi);
		
		
		
			
		}
		
		
			
				
			}
			
		
	
		
		
		
		
		
	


