package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;

public class Etal<P extends IProduit> {
	private Gaulois vendeur;
	private P[] produits;
	private int nbProduit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	private int prix;

	

	public Etal(Gaulois vendeur, int quantiteDebutMarche, int prix) {
		this.vendeur = vendeur;
		this.quantiteDebutMarche = quantiteDebutMarche;
		this.prix = prix;
		this.nbProduit = 0;
		this.quantite = quantiteDebutMarche;
	}

	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}

}
