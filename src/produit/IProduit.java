package produit;

public interface IProduit {

	String decrireProduit();

	String getNom();

	unite getUnite();

	int calculerPrix(int prix);


}