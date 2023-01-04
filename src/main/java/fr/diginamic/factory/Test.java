package fr.diginamic.factory;

public class Test {
	
	public static void main (String[] args) {
		
		ObjetConnecteFactory factory = new ObjetConnecteFactory();
		
		ObjetConnecte objet1 = factory.getObjetConnecte(TypeObjet.TELEPHONE, 22);
		ObjetConnecte objet2 = factory.getObjetConnecte(TypeObjet.TABLETTE, 10);
		ObjetConnecte objet3 = factory.getObjetConnecte(TypeObjet.ENCEINTE, 35);
		
		System.out.println(objet1.getClass() + " " + objet1.getLimiteVolts());
		
	}

}
