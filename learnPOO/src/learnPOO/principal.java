package learnPOO;

public class principal {
	public static void main(String[] args)
	{
Ville v = null;
				try {
				v = new Ville("ds", "Cameroun", -600);
				}
				catch(NbrException e)
				{
					e.printStackTrace();
					 v = new Ville();
				}
				catch(NomVilleException e2)
				{
					System.out.println(e2.getMessage());
					 v = new Ville();
				}
				
				finally
				{
					System.out.println("-------------------------------------------------");
					System.out.println("\ttout ce qui est ici sera executer!");
					System.out.println("--------------------------------------------------");
					System.out.println(v.descripv());
				}
				System.out.println("la super class de la classe "+Capital.class.getName()+" est java "+Capital.class.getSuperclass());
				
}
}