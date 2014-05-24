
import java.io.*;
import java.util.Formatter;
import java.util.regex.*;
public class Klasa {

	int wiek;
	String imie;
	
	void PrintTotal()
	{
		System.out.println("Masz na imie: " +  imie);
		System.out.println("Twoj wiek to: " +  wiek);
		Formatter f = new Formatter();
		System.out.println("Z uzyciem formatera: ");
		f.format("%-15s %5s", "Imie", "Wiek");
		f.format("%-15s %5s", imie, wiek);
	}
	
	public static BufferedReader input = new BufferedReader(new StringReader("cos"));
	public static void main(String[] args)
	{
		try{
		System.out.println("Prosze podac swoje imie: ");
		String imie2 = input.readLine();
		Klasa klas = new Klasa();
		klas.imie = imie2;
		System.out.println("Prosze podac swoj wiek: ");
		String wiek2 = input.readLine();
		klas.wiek = Integer.parseInt(wiek2);
		}catch(Exception e)
		{
			System.out.println("Wystapil wyjatek");
		}
		
		}
		
}

