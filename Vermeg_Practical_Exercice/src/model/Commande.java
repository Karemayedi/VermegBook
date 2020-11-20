package model;

import java.util.Date;
import java.util.Vector;

public class Commande {
	private String ref ;
	private Date datecommande;
	LigneCommande c2;
	private Vector<LigneCommande> vec=new Vector<LigneCommande>();
	public Commande(String ref, Date datecommande) {
		super();
		this.ref = ref;
		this.datecommande = datecommande;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
		public Date getDatecommande() {
		return datecommande;
	}
	public void setDatecommande(Date datecommande) {
		this.datecommande = datecommande;
	}
	@Override
	public String toString() {
		return "Commande [ref=" + ref +  ", datecommande=" + datecommande +"]";
	}
	public double totalprice() {
		double	prixt=0;
		for(int i=0;i<vec.size();i++) {
			 prixt=prixt+vec.elementAt(i).calculer();
		}
		return prixt;
	}
	public void Addlc(LigneCommande lc ) {
		vec.add(lc);
		System.out.println("la ligne de commande "+lc +"est ajouter");
	}
	public void afficher() {
		for(int i=0;i<vec.size();i++) {
			vec.elementAt(i).affiche();
	}
}}
