package model;

import java.sql.SQLException;
import java.util.Date;

import connexion.MyConnection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d =new Date(2020,11,10);
		Commande c1=new Commande("s", d);
		Client c= new Client(1,"s","s","h");
		c.Ajouter_Commande(c1);
		LigneCommande lc1=new LigneCommande(1,20);
		LigneCommande lc2=new LigneCommande(1,25);
c1.Addlc(lc1);
c1.Addlc(lc2);
Livre l =new Livre("les miserables", "paulo coelho", 2, 15,"10/11/2020");
Livre l2 =new Livre("les miserables", "paulo coelho", 3, 3,"15/12/2020");
lc1.setLivre(l);
lc2.setLivre(l2);

System.out.println("le prix totale pour ce livre est"+lc1.calculer());
System.out.println("le prix totale pour ce livre est"+lc2.calculer());

double f1 =c1.totalprice();
System.out.println("le prix totale pour cette commande est"+f1);

try {
	try {
		
		MyConnection c2=new MyConnection()	;
		c2.add(l2);
	System.out.println(c2.getAll());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
		

		

	}


