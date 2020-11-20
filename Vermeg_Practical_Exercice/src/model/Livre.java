package model;

public class Livre {
	private String titre;
	private String author;
	private String ref;
	private  double prixU;
	public Livre(String titre, String author, String ref, double prixU) {
		super();
		this.titre = titre;
		this.author = author;
		this.ref = ref;
		this.prixU = prixU;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public double getPrixU() {
		return prixU;
	}
	public void setPrixU(double prixU) {
		this.prixU = prixU;
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", author=" + author + ", ref=" + ref + ", prixU=" + prixU + "]";
	}
	
	

}
