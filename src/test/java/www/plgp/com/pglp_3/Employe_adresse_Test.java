package www.plgp.com.pglp_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Employe_adresse_Test {
	  String nom;
	  String adresse;
	  Employe emp;

	@Before
	public void setup ()
	{
		emp=new Employe("maiga abdoul rachid","23 places saint cristophe",100,12); 
		nom="maiga abdoul rachid";
		adresse="23 places saint cristophe";
		
	}
	
	@Test
	public void test_adresse()
	{
		
		if(emp.toString().equals("maiga abdoul rachid situé au 23 places saint cristophe" ))
			assertTrue(true);
	
	}
	
}
