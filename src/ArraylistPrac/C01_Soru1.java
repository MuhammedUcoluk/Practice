package ArraylistPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01_Soru1 {

	public static void main(String[] args) {
		// 1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
		
	
		List<String> str =new ArrayList<>();
		
		str.add("A");
		str.add("C");
		str.add("E");
		str.add("F");
		
		System.out.println(str);
		// 2) indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
			//index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
				//ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
		str.add("B");
		str.add(1, "L");
		System.out.println(str);
		
		//3) set() methodu kullanarak, E’yi D yapiniz.
			//	ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
		
		str.set(3, "D");
		System.out.println(str);
		
		//4) remove() methodu kullanarak, F’yi siliniz.
			//ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
		
		str.remove(4);
		System.out.println(str);
		
		//5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
			//ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
		
		Collections.sort(str);
		System.out.println(str);
		
		//6) contains() methodu kullanarak, L’nin list’de var oldugunu ve 
			//M’nin list’de var olmadigini dogrulayiniz.
		
		System.out.println(str.contains("L"));
		System.out.println(str.contains("M"));
		
		//7) size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz
		
		System.out.println(str.size());
		
		//8) clear() methodu kullanarak, list’deki tum elemanlari siliniz.
		
		str.clear();
		
		//9) isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz
		
		System.out.println(str.isEmpty() );


		
	}
	
}