package connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Livre;

public class MyConnection {
	Connection c=null;
	Statement stmt=null;
	public MyConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3308/bookstore";
		c=DriverManager.getConnection(url, "root", "");
		if(c==null) {
			System.out.println("probleme de connexion a la source de donnée...");
		}
		else {
			//creation d'un contexte
			System.out.println("connexion etablie a la source de donnée...");
	}}
	private ArrayList<Livre> Books=new ArrayList<Livre>();
	public ArrayList<Livre> getBook() {
		return Books;
	}

	public void setBook(ArrayList<Livre> Books) {
		this.Books = Books;
	}
	public void add(Livre b) {
		try {
			java.sql.PreparedStatement pr=c.prepareStatement("INSERT INTO book (title,author,price,releasedate) VALUES(?,?,?,?)");
			pr.setString(1,b.getTitre());
			pr.setString(2,b.getAuthor());
			pr.setDouble(3, b.getPrixU());
			pr.setString(4, b.getReleaseDate());
		if((pr.execute())==true) {
			System.out.println("livre non ajouté");}
			else {
				System.out.println("livre  ajouté");
			}		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Books.add(b);}
	public ArrayList getAll() {
		ArrayList<Livre> listBooks = new ArrayList<Livre>();
		try {
			java.sql.PreparedStatement pr=c.prepareStatement("SELECT * FROM book");
			ResultSet rs = pr.executeQuery();
	 while (rs.next()) {
		 Livre bo = new Livre();
	bo.setRef(rs.getInt("id"));
	bo.setTitre(rs.getString("title"));
	bo.setAuthor(rs.getString("author"));
	bo.setReleaseDate(rs.getString("releasedate"));
	bo.setPrixU(rs.getDouble("price"));

	listBooks.add(bo); 
 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return listBooks;
	}
	
	

}
