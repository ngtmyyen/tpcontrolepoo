package tpcontrolepoo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tarif {

	public Porte entree;
	public Porte sortie;
	public BigDecimal prix;
	public LocalDateTime dateValidite;
	
	
	public Tarif(Porte porteEntree, Porte porteSortie, BigDecimal tarifExacte) {
		// TODO Auto-generated constructor stub
	}

	

	public Tarif() {
		// TODO Auto-generated constructor stub
	}



	//Entree
	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public Porte getEntree(){
		return entree;
	}
	
	//Sortie
	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	//Prix
	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	//DateValidite
	public LocalDateTime getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(LocalDateTime dateValidite) {
		this.dateValidite = dateValidite;
	}

	public String toString() {
		return super.toString();
	}
	
	

}
