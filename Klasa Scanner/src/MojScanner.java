import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.*;
public class MojScanner {

	static String data = 
			"563456"+
			"563";
	
	public static void main(String[] args) {
	
	/*	Scanner scan = new Scanner("12, 43, 45, 65");
		scan.useDelimiter("\\s*,\\s*"); // ustawia nowe wyrazenie regularne separatora
		while(scan.hasNextInt())
		{
			System.out.println(scan.nextInt());
			
		}*/
		
		Scanner scane = new Scanner(data);
		String pattern = "\\d+";
		//Pattern regex = Pattern.compile(pattern);
		while(scane.hasNext(pattern))
		{
			System.out.println("rf");
			scane.next(pattern);
			MatchResult match = scane.match();
			String pierwsza = match.group();
			System.out.format("Atak dnia %s\n", pierwsza);
			
			//Formatter f = new Formatter(System.out);
			//f.format("%-15s %-5s\n", pierwsza, druga);
			
		}
		
		
		
		
	}

}
