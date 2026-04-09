package produit;

public class Poisson extends Produit {
	private String date;

	public Poisson(String date) {
		super("poisson", produit.unite.PIECE);
		this.date = date;
	}

	@Override
	public void decrireProduit() {
		StringBuilder string = new StringBuilder();
		string.append(this.getUnite().getNom());
		string.append(" pêchés ");
		string.append(this.date);
		System.out.println(string.toString());
	}

}
