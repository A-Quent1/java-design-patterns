package fr.diginamic.factory;

public enum TypeObjet {
	
	TELEPHONE ("Téléphone portable"),
	TABLETTE ("Tablette"),
	ENCEINTE ("Enceinte connectée");
	
	public String libelle;
	
	TypeObjet(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter pour l'attribut libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter pour l'attribut libelle
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
