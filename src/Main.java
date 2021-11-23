import java.io.IOException;

public class Main
{
	public static void main(String[] args)
	{
		ListaAziendeUniversita lista = new ListaAziendeUniversita();
		
		System.out.println("Lettura del file in corso...");
		try
		{
			lista.leggiFile();
			System.out.println(lista.toString());
		} 
		catch (IOException e)
		{
			System.out.println("Errore di lettura del file: " + e.getMessage());
		}		
	}
}
