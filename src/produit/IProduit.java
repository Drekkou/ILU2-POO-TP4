package produit;

public interface IProduit {

	String decrireProduit();

	String getNom();

	Unite getUnite();

	public default int calculerPrix(int prix) {
		return prix;
	}

}