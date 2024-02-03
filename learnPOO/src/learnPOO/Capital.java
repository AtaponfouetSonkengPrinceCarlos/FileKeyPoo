package learnPOO;

public class Capital extends Ville {
	private String president;
	public Capital()
	{
		super();
		president ="aucun";
	}
	public String descripv()
	{
		return super.descripv()+"\t ==> "+this.president+" est le president";
	}
	public void setPresident(String presi)
	{
		this.president = presi;
	}
	public String getpresident()
	{
		return president;
	}
	public Capital(String nomv,String nompys,int nbrhbts,String presi)
	{
		super(nomv,nompys,nbrhbts);
		System.out.println("creation d un objet capital");
		this.president = presi;
		
	}
	public String toString()
	{
		return super.toString()+" \n\t ==>" +this.president +" est le president";
	}

}
