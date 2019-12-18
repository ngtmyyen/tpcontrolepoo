package tpcontrolepoo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAutoroute {

    public List<Route> routes = new ArrayList<Route>();
    public List<Tarif> tarifs = new ArrayList<Tarif>();
    
    public BigDecimal obtenirTarif(Porte porteEntree, Porte porteSortie) {
    	//ajouter
		return null; // à ajouter
    	
    }
    
    
     public Tarif getTarifCalcule(Porte porteEntree, Porte porteSortie) {
    	BigDecimal tarifCalcule=null;
    	Tarif t = new Tarif();
    	if(porteSortie.getNumeroDePorte() != (porteEntree.getNumeroDePorte()+1)) {
    		int n = porteSortie.getNumeroDePorte() - porteEntree.getNumeroDePorte();
    		for(int i= 0; i<n; i++) {
    			tarifCalcule= tarifCalcule + getTarifExacte(porteEntree,porteSortie).getPrix();  
    		}
    	}
    	else {
    		tarifCalcule = getTarifExacte(porteEntree,porteSortie).getPrix();
    	}
    	
		return new Tarif(porteEntree, porteSortie, tarifCacule);
    	
    }
    
    public Tarif getTarifExacte(Porte porteEntree, Porte porteSortie) {
    	BigDecimal tarifExacte = null;
    	Tarif t = new Tarif();
    	for (int i=0; i<tarifs.size(); i++) {
    		if( (porteEntree== t.getEntree()) && (porteSortie == t.getSortie())) {
    		 	tarifExacte = t.getPrix();
    		}   		
    	}
    	return new Tarif(porteEntree, porteSortie,tarifExacte);
		
		
    	
    }
    
    public void ajouterTarif(Tarif tarif) {
    	
    	tarifs.add(tarif);
    }
    
    public void ajouterRoute(Route route) {
    	routes.add(route);
    }
	


}
