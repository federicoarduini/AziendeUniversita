public class Azienda
{
	private String nome;
	private String tipo;
	private String citta;
	private int numImpiegati;
	
	public Azienda (String nome, String tipo, String citta, int numImpiegati)
	{
		this.nome = nome;
		this.tipo = tipo;
		this.citta = citta;
		this.numImpiegati = numImpiegati;
	}

	public String getNome() 
	{
		return nome;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public String getCitta() 
	{
		return citta;
	}

	public int getNumImpiegati() {
		return numImpiegati;
	}
	
	public String toString()
	{
		String s = "";
		      s += "Azienda: " + this.getNome() + " - " + this.getTipo() + "\n";
		      s += "Citta': " + this.getCitta() + "\n";
		      s += this.getNumImpiegati() + " impiegati\n\n";
		      
		return s;
	}
}
