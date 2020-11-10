package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		boolean resultat;
		PrintWriter skriver = null;
		try {
		skriver = new PrintWriter(filnavn);	
		for (int i = 0; i < samling.getAntall(); i++) {
			skriver.println(samling.getSamling()[i].toString());
		}
		resultat = true;
		}
		catch(FileNotFoundException e)	{
			System.out.println("Filen finnes ikke");
			resultat = false;
		}
		
		finally {
			if (skriver != null) {
				skriver.close();
			}
		
		}
		return resultat;
	
		
	}
}

