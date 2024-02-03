package learnPOO;

public class NbrException extends Exception {
	public NbrException(int nbrhts)
	{
		System.out.println("vous essayer d'instacier un Objet ville avec un nombre d habitant negatif!");
		System.out.println("\t => "+nbrhts);
	}
		
}
