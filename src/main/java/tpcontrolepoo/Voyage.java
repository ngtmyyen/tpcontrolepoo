package tpcontrolepoo;

import java.math.BigDecimal;

public class Voyage {

	public Porte entree;
	public Porte sortie;
	public CompagnieAutoroute autoroute;
	public BigDecimal tarif;
	
	
	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}

	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}

	public BigDecimal getTarif() {
		return tarif;
	}
}
