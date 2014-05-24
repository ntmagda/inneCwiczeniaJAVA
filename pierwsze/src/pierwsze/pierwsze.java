package pierwsze;

public class pierwsze 
{
	static int licznik=4;
	static int wynik=4;
	 public static void main(String[] args)
	 {
		 for ( int i =0; i <100; ++i)
		 {
			 int licznik =0;
			 for ( int j =1; j < i+1 ;++j)
			 {
				 if(i%j==0)
				 {
					licznik++;
				 }
			 }
			 if(licznik==2)
			 {
				 System.out.println("Liczba pierwsza: " + i );
			 }
		 }
	 }
	
}