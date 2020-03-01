package www.plgp.com.pglp_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class Employe_salaire_Test {

	double taux_horaire;
	double nbre_heure;
	Employe_salaire emp;
	
	@Before
	public void setup()
	{
		
		taux_horaire=12;
		nbre_heure=100;		
		emp=new Employe_salaire("maiga", "23 places saint cristophe", nbre_heure, taux_horaire);
	}
	
	
	@Test
	public void test_salaire() {


	    assertThat(emp.calculsalaire(), is(equalTo(1200)));
		
	}

}
