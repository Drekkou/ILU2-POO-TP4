package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;
import villagegaulois.IVillage;

public class Scenario {

	public static void main(String[] args) {

		class Village implements IVillage {
			IEtal[] marche;
			int nbEtal;
			int nbMaxEtal;

			protected Village(int nombreEtal) {
				super();
				this.marche = new Etal[nombreEtal];
				nbMaxEtal = nombreEtal;
				nbEtal = 0;
			}

			@Override
			public <P extends Produit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix) {
				if (nbEtal < nbMaxEtal) {
					etal.installerVendeur(vendeur, produit, prix);
					this.marche[nbEtal] = etal;
					nbEtal++;
					return true;
				}
				return false;
			}

			@Override
			public void acheterProduit(String produit, int quantiteSouhaitee) {
				ScenarioTest.acheterProduit(marche, produit, quantiteSouhaitee);
			}

			@Override
			public String toString() {
				StringBuilder string = new StringBuilder();
				for (int i = 0; i < this.marche.length; i++) {
					string.append(marche[i].etalEtal());
				}
				return string.toString();
			}

		}

		// fin

		Village village = new Village(3);

		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier(200, obelix);
		Sanglier sanglier2 = new Sanglier(150, obelix);
		Sanglier sanglier3 = new Sanglier(100, asterix);
		Sanglier sanglier4 = new Sanglier(50, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };

		village.installerVendeur(etalSanglierAsterix, asterix, sangliersAsterix, 10);
		village.installerVendeur(etalSanglierObelix, obelix, sangliersObelix, 8);
		village.installerVendeur(etalPoisson, ordralfabetix, poissons, 5);

		System.out.println(village);

		village.acheterProduit("sanglier", 3);

		System.out.println(village);
	}

}

