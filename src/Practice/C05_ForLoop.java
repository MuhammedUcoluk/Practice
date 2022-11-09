package Practice;

public class C05_ForLoop {

	public static void main(String[] args) {
		// 20 den 120 ye kadar 3 ile tam bölünebilen sayıları consola yazdıran bir program
		
		for (int i = 20; i <= 120; i++) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}

	}

}
