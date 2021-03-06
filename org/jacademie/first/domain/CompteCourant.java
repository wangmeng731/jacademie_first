package org.jacademie.first.domain;

public class CompteCourant extends Compte {

	private Double montantDecouvertAutorise;
	
	public CompteCourant() {

		super();
		
		this.montantDecouvertAutorise = 0.0;
	}
	
	public CompteCourant(String numero, String intitule, Double solde,
			Double montantDecouvertAutorise) {
			
		super(numero, intitule, solde);
		
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}
	
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		
		result.append(super.toString());
		
		result.append(" (CompteCourant, montantDecouvertAutorise : " + this.montantDecouvertAutorise + ")");
		
		return result.toString();
	}

	public Double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}

	public void setMontantDecouvertAutorise(Double montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}
}
