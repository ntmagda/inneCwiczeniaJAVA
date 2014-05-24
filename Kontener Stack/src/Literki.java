
public class Literki {
	
	public static void main(String[] args)
	{
		Stack<String> stos = new Stack<String>();
		Stack<String> stos1 = new Stack<String>();
		String zdanie = "+B+a+l---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";
		String[] tablica = zdanie.split("");
		
		for( int i =0; i <tablica.length; i++)
		{
			if(tablica[i].equals("+"))
			{
				stos.push(tablica[i+1]);
			}
			if(tablica[i].equals("-"))
			{
				System.out.println(stos.pop());
			}
			
			
		}
	
		
	}

}
