/* chapitre 2 Patate.java */

public class Patate {
	public static void main (String[] args) {
		/* 1- faire les entrées */

		// déclarer des noms
		double poids; // declaration de variable
		double prixAPayer;

		// les entrées
		Terminal.ecrireString("Quel poids? "); // apelle à la method, envoi de message
		poids = Terminal.lireDouble(); // "=" est une affectation

		// 2- faire les calculs
		prixAPayer = poids * 2.6;


		// 3- faire les sorties (afficher les résultats)
		Terminal.ecrireString("Prix a Payer ");
		Terminal.ecrireDoubleln(prixAPayer);
	}
}
