package fr.diginamic.factory;

public class ObjetConnecte{
	
	private int limiteVolts;

	public ObjetConnecte(int limiteVolts) {
		super();
		this.limiteVolts = limiteVolts;
	}

	/**
	 * Getter pour l'attribut limiteVolts
	 * @return the limiteVolts
	 */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/**
	 * Setter pour l'attribut limiteVolts
	 * @param limiteVolts the limiteVolts to set
	 */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}
	
}
