package Practice;

public class C01_WhileLoop {

	public static void main(String[] args) {
		//Oluşturulan array elementlerini toplayan bir progam.
		
		
		
		int arr[]= {3,5,7,9,11,13,20,100,100};
		int sira=0;
		int uzunluk=arr.length;
		int toplam=0;
		
		while (sira<uzunluk) {
			
			toplam+=arr[sira];
			sira++;
		}
		System.out.println("toplam : "+ toplam);
	}

}
	

