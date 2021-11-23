import java.util.Vector;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ListaAziendeUniversita
{
	private Vector<Azienda> listaAziende;
	
	public ListaAziendeUniversita()
	{
		this.listaAziende = new Vector<Azienda>();
	}
	
	public void leggiFile() throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader("aziende_uni.csv"));
		String linea;
		
		while ((linea = reader.readLine()) != null)
		{
			String a[] = linea.split(",");
			
			String nome = a[0];
			String tipo = a[1];
			String citta = a[2];
			int numImpiegati = Integer.parseInt(a[3]);
			Azienda az = new Azienda(nome, tipo, citta, numImpiegati);
			
			this.listaAziende.add(az);
		}
	}
	
	public String toString()
	{
		String s = "LISTA AZIENDE\n";
		      s += "=======================\n\n";
		      
		for (Azienda x : this.listaAziende)
			s += x.toString();
		
		return s;
	}
}
