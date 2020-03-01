package www.plgp.com.pglp_3;

public class Employe {
protected String nom;
protected String adresse;
protected  double nombre_heure;
protected double taux_horaire;

public Employe(String nom,String adresse, double nombre_heure,double taux_horaire)
{
	this.nom=nom;
	this.adresse=adresse;
	this.nombre_heure=nombre_heure;
	this.taux_horaire=taux_horaire;
}

 @Override
	public String toString() {
		
		return nom +" situé au "+adresse;
	}
}
