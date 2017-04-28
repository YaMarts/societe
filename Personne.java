
public class Personne {
			
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		
		
	}
	String prenom;
	String nom;
	int age;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return prenom +" "+ nom;
	}
	
}
