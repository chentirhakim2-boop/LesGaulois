package personnages;

public abstract class Personnages {
	
	private String nom;
	private int force;
	
	public Personnages(String nom,int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
        System.out.println(donnerAuteur() + nom + " : " + texte + " ».");
    }
	
	protected abstract String donnerAuteur();
	

	public void frapper(Romain romain) {
    	System.out.parler(nom +" envoie un grand coup dans la mâchoire de " + romain.getNom());
    	romain.recevoirCoup(force/3);
    }
	
	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force > 0) {
			System.out.parler("Aïe !");
		} else {
			force = 0;
			System.out.parler("J'abandonne...");
		}
	}
	
	
}
