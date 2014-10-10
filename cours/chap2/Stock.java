public class Stock {
	public static void main (String[] args) {
		// faire les entrées

		// delcarer les nom
		int nombreDesStocks;
		int ajoutDeStock;
		nombreDesStocks = 14;

		// les entrées
		System.out.println("Le stock actuelle est de " + nombreDesStocks);
		System.out.print("Combien de poires voulez vous ajouter? ");
		ajoutDeStock = Terminal.lireInt();
		nombreDesStocks += ajoutDeStock;

		// les sorties
		System.out.println("Il reste maintenant " + nombreDesStocks + " poires");

	}
}