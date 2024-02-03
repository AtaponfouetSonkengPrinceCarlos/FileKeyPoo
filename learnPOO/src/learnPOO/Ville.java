package learnPOO;

public class Ville  extends Object {
	public static int nbrinstance1;
	protected static int nbrinstance2;
	 protected String nomville;
	 protected String nompays;
	protected int nbrhabitant;
	protected char categori;
	public Ville()
	{
		System.out.println("creation d un objet ville");
		nbrinstance1++;
		nbrinstance2++;
		nomville ="inconnu";
		nompays ="inconnu";
		nbrhabitant = 0;
		this.setcategori();
	}
	public String toString()
	{
		return "\t "+this.nomville+" est une ville de "+this.nompays+", elle comporte "+this.nbrhabitant+"habitant elle est de categorie ==> "+this.categori;
	}
	public Ville(String nomv,String nompys,int nbrhts)throws NbrException, NomVilleException
	{
		if(nbrhts<0)
		
			throw new NbrException(nbrhts);
		if(nomv.length()<3)
			throw new NomVilleException("Le nom de ville est inferieure a trois caracteres! nom = "+nomv);
		else
		{
		nbrinstance1++;
		nbrinstance2++;
		System.out.println("creation d un objet ville avec ses parametres");
		nomville = nomv;
		nompays = nompys;
		nbrhabitant =nbrhts;
		this.setcategori();
		}
	}
	public String getnomville()
	{
		return nomville;
	}
	public String getnompays()
	{
		return nompays;
	}
	public int getnbrhabitant()
	{
		return nbrhabitant;
	}
	public void setnomville(String nomv)
	{
		nomville = nomv;
	}
	public void setnompays(String nompys)
	{
		nompays = nompys;
	}
	public void setnbrhabitant(int nbrhts)
	{
		nbrhabitant = nbrhts;
	}
	public char getcategori()
	{
		return categori;
	}
	protected void setcategori()
	{
		int tabnbrhabitant[] = {0,100,1000,10000};
		char categori[] = {'?','A','B','c'};
		int i =0;
		while( i < tabnbrhabitant.length && this.nbrhabitant >=tabnbrhabitant[i])
		{
			this.categori =categori[i];
			i++;
		
		}
	
}
	public String descripv()
	{
		return "\t "+this.nomville+" est une ville de "+this.nompays+" elle comporte "+this.nbrhabitant+"habitants, elle est de categorie => : "+this.categori;
	}
	public String compareville(Ville v1)
	{
		String str = new String();
		if(v1.getnbrhabitant() > this.nbrhabitant)
		
			str = v1.getnomville()+" est une ville peuple que "+this.nomville;
		else
		
			str =this.nomville+ "est une ville peuple que "+this.getnbrhabitant();
		return str;
		
	}
	public static int getnbrinstance2()
	{
		return nbrinstance2;
	}
	
	}

