package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private Gaulois gaulois;
	private int poids;

	public Sanglier(int poids, Gaulois gaulois) {
		super("sanglier", produit.unite.KG);
		this.gaulois = gaulois;
		this.poids = poids;
	}

	@Override
	public String decrireProduit() {
		StringBuilder string = new StringBuilder();
		string.append(this.getNom());
		string.append(" de ");
		string.append(poids);
		string.append(" ");
		string.append(getUnite().getNom());
		string.append(" chassé par ");
		string.append(gaulois.getNom());
		string.append(".");
		return string.toString();
	}

	@Override
	public int calculerPrix(int prix) {
		return this.poids * prix;
	}
}
