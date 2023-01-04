package fr.diginamic.factory;

public class ObjetConnecteFactory {
	
	public ObjetConnecte getObjetConnecte(TypeObjet t, int limiteVolts) {
		
		if (t.equals(TypeObjet.TELEPHONE)) {
			
			return new TelephonePortable(limiteVolts);
		}
		else if (t.equals(TypeObjet.TABLETTE)) {
			
			return new Tablette(limiteVolts);
		}
		
		else if (t.equals(TypeObjet.ENCEINTE)) {
			
			return new Enceinte(limiteVolts);
		}
		
		else {
			return null;
		}
	}

}
