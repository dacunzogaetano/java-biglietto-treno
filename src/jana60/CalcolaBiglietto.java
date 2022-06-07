package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		float etaPersona;
		float kmViaggio;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci la tua et�");
		etaPersona = scan.nextFloat();
		
		System.out.println("Quanti chilometri percorrerai?");
		kmViaggio = scan.nextFloat();
		
		double prezzoViaggioNormale = kmViaggio * 0.21;
		
		double scontoMinorenni = prezzoViaggioNormale * 0.2;
		double scontoPensionati = prezzoViaggioNormale * 0.4;
		
		double prezzoViaggioMinorenni = prezzoViaggioNormale - scontoMinorenni;
		double prezzoViaggioPensionati = prezzoViaggioNormale - scontoPensionati;
		
		
		if (etaPersona <= 0) {
			System.out.println("Non sai nemmeno inserire un'et� corretta, vai via");
		} else if (kmViaggio <= 0) {
			System.out.println("Non fare il furbo");
		} else if (etaPersona < 19 ) {
			System.out.println("Il prezzo del biglietto �: " + prezzoViaggioMinorenni + "�,"	
					+ " hai un sconto di " + scontoMinorenni + "�.");			
		} else if (etaPersona > 65) {
			System.out.println("Il prezzo del biglietto �: " + prezzoViaggioPensionati + "�,"
					+ " hai uno sconto di " + scontoPensionati + "�.");
		} else {
			System.out.println("Il prezzo del biglietto �: " + prezzoViaggioNormale + "�.");
		}
		scan.close();
	}
}
