package ForEachLoop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// //Soru 4:
		//Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak 
		//yazdiriniz. ipucu: split
	
	String isim="Ali";
	
	String arr[]=isim.split("");
	
	List<String> krk=Arrays.asList(arr);
	
	String yeniKrk="";
	for (String each : krk) {
		
		yeniKrk+=krk;
	}
	
	System.out.println(yeniKrk);
	
		
	
	
	}

}
