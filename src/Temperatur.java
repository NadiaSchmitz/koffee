import Prog1Tools.IOTools;
import java.text.DecimalFormat;

public class Temperatur {

	public static void main(String[] args) {

		int i = 1;
		double temperatur_koffee, temperatur_zimmer;
		
		DecimalFormat df = new DecimalFormat("###.#");
		
		temperatur_zimmer = 21;
		
		temperatur_koffee = IOTools.readInteger("Geben Sie die Anfangstemperatur des Koffees zwische 0 und 100 Grad Celsius ein: ");
		
		if (temperatur_koffee < 0 || temperatur_koffee > 100) {
			
			System.out.println("Nur Werte zwischen 0 und 100 Grad Celsius!");
			temperatur_koffee = IOTools.readInteger("Geben Sie die Anfangstemperatur des Koffees zwische 0 und 100 Grad Celsius ein: ");
			
		}
		
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("           TEMPERATUR");
		System.out.println("--------------------------------------------");
		System.out.println("  Minute  " + "  Koffee  " + "  Zimmer  " + "  Differenz  ");
		
		while (Math.abs(temperatur_koffee - temperatur_zimmer) >= 0.5) {
			
			temperatur_koffee = temperatur_koffee + (temperatur_zimmer - temperatur_koffee) * 0.1;
			
			System.out.println("  " + i + "         " + df.format(temperatur_koffee) + "      " + temperatur_zimmer + "      " + df.format(temperatur_zimmer - temperatur_koffee));
			
			i++;
			
		}

	}

}
