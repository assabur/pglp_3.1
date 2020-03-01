package www.plgp.com.pglp_3;

public class Employe_salaire extends Employe
{
	

	public Employe_salaire(String nom, String adresse, double nombre_heure, double taux_horaire) {
		super(nom, adresse, nombre_heure, taux_horaire);
		// TODO Auto-generated constructor stub
	}

	public double calculsalaire()
	{
		return super.nombre_heure*super.taux_horaire;
	}
}
