package model;

import java.util.Date;

public class Livre {
	private String titre;
	private String author;
	private int ref;
	private String releaseDate;
	private  double prixU;
	public Livre(String titre, String author, int ref, double prixU,String releaseDate) {
		super();
		this.titre = titre;
		this.author = author;
		this.ref = ref;
		this.prixU = prixU;
		this.releaseDate=releaseDate;
	}
	
	public Livre() {
		super();
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
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public double getPrixU() {
		return prixU;
	}
	public void setPrixU(double prixU) {
		this.prixU = prixU;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", author=" + author + ", ref=" + ref + ", releasedate="+releaseDate+", prixU=" + prixU + "]";
	}
	
	

}
