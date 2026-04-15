package produit;

enum unite {
	G("g", 0), KG("kg", 1), L("l", 2), CL("cl", 3), ML("ml", 4), PIECE("piece", 5);

	private String nom;
	private int index;

	private unite(String nom, int index) {
		this.nom = nom;
		this.index = index;
	}

	public String getNom() {
		return nom;
	}

	public int getIndex() {
		return index;
	}

}

public abstract class Produit implements IProduit {
	private String nom;
	private unite unite;

	protected Produit(String nom, produit.unite unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public unite getUnite() {
		return this.unite;
	}

}
