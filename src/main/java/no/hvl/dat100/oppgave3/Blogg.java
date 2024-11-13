package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] samling;
	private int antall;

	public Blogg() {
		this.samling = new Innlegg[20];
        this.antall = 0;
        }

	public Blogg(int lengde) {
		this.samling = new Innlegg[lengde];
        this.antall = 0;
        }

	public int getAntall() {
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return samling;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < antall; i++) {
            if (samling[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
    }

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return antall < samling.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        if (ledigPlass()) {
            samling[antall] = innlegg;
            antall++;
            return true;
        }
        else
        return false;
    }
	
	public String toString() {
	    StringBuilder sb = new StringBuilder();	    
	    sb.append(antall).append("\n");	    
	    for (int i = 0; i < antall; i++) {
	        sb.append(samling[i].toString());
	    }
	    
	    return sb.toString();
	}
}