package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.oppgave3.*;
import no.hvl.dat100.oppgave1.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
	    try {
	        PrintWriter writer = new PrintWriter(mappe + filnavn);       
	        writer.println(samling.getAntall());     
	        for (Innlegg innlegg : samling.getSamling()) {
	            if (innlegg != null) {
	                writer.print(innlegg.toString());
	            }
	        }	        
	        writer.close();
	        return true;     
	        
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
}
