package produit;

public class Poisson extends Produit {
	private String date;

	public Poisson(String date) {
		super("poisson", Unite.PIECE);
		this.date = date;
	}

	@Override
	public String decrireProduit() {
		StringBuilder string = new StringBuilder();
		string.append(this.getUnite().getNom());
		string.append(" pêché ");
		string.append(this.date);
		return string.toString();
	}

}
