package model;

public class LigneCommande {
	private int id_lc;
	private int quantite; 
	private Livre livre;
	public LigneCommande(int id_lc, int quantite) {
		super();
		this.id_lc = id_lc;
		this.quantite = quantite;
	}
	public int getId_lc() {
		return id_lc;
	}
	public void setId_lc(int id_lc) {
		this.id_lc = id_lc;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Livre getLivre() {
		return livre;
	}
	public void setLivre(Livre livre) {
		this.livre = livre;
	}
	@Override
	public String toString() {
		return "LigneCommande [id_lc=" + id_lc + ", quantite=" + quantite + "]";
	}
	public double calculer() {
		
		double  totallc=quantite*livre.getPrixU();
		return totallc;
	}
 public void affiche() {
	 System.out.println("le prix unitaire est"+livre.getPrixU());
	 System.out.println("la quantite est "+quantite);
 }
}

