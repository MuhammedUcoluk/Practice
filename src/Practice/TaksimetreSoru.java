package Practice;

public class TaksimetreSoru {

	public static void main(String[] args) {
		
		double kmbası=2.20;
		double gidilenkm = 1;
		double minimum=20;
		double acılıs=10;
		double toplamTutar;
		
		toplamTutar=(acılıs+(kmbası*gidilenkm));
		
		
		if (toplamTutar<minimum) {
			System.out.println("Ödenecek tutar : " + minimum);
		} else {
			System.out.println("Ödenecek tutar : " + toplamTutar);
		}

	}

}