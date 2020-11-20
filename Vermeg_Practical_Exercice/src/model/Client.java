package model;

public class Client {
	int id_c;
	String nom ;
	String prenom ;
	String adresse;
	int nbc=30;
	int nbcc =0;
	Commande [] co =new Commande [nbc];
	public Client(int id_c, String nom, String prenom, String adresse) {
		super();
		this.id_c = id_c;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	public Client(int id_c, String nom, String prenom, String adresse, Commande[] co) {
		super();
		this.id_c = id_c;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.co = co;
	}
	public int getId_c() {
		return id_c;
	}
	public void setId_c(int id_c) {
		this.id_c = id_c;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Client [id_c=" + id_c + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	public void Ajouter_Commande(Commande c)
	{ if(nbcc<nbc)
	 {this.co[nbcc]=c ;
	 nbcc++;
	 System.out.println("le nombre de commande du client " + getPrenom()+ " est " + nbcc );}
	}
}
