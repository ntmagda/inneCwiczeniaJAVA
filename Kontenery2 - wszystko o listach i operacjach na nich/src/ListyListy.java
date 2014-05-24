
import java.util.*;
public class ListyListy {

	public static void main(String[] args)
	{
		List<String> wyrazy = new ArrayList<String>();
		wyrazy.add("mama"); // dodaje obiekty
		wyrazy.add("tata");
		wyrazy.add("dziecko");
		wyrazy.add("babcia");
		wyrazy.add("dziadek");
		
		System.out.println(wyrazy);
		wyrazy.remove("babcia");// usuwa przez obiekt
		wyrazy.remove(2); // usuwa przez indeks
		System.out.println(wyrazy);
		wyrazy.add("babcia");
		wyrazy.add("dziecko");
		
		System.out.println("Indeks dziadka: " + wyrazy.indexOf("dziadek")); // sprawdza indeks danego obiektu
		wyrazy.add(1,"klacz"); // wstawianie pod indeks
		System.out.println(wyrazy); 
		
		List<String> noweWyrazy= wyrazy.subList(1,4);
		System.out.println(noweWyrazy); // lista pomiedzy indeksami 1-4
		System.out.println(wyrazy.containsAll(noweWyrazy)); // sprawdza czy wyrazy zawieraja podzbior noweWyrazy
		Collections.sort(noweWyrazy); // sortuje noweWyrazy
		System.out.println(noweWyrazy); 
		Collections.shuffle(wyrazy); // tasowanie wyrazow - byle jak
		System.out.println(wyrazy); 
		List<String> copy = new ArrayList <String>(wyrazy); // kopiuje wyrazy - konstruktor kopiujacy
		System.out.println(copy.retainAll(noweWyrazy));	// sprawdza czy noweWyrazy sa czescia wspolna z wyrazy - są
		noweWyrazy.add("fghj");
		System.out.println(copy.retainAll(noweWyrazy));	// tutaj nie są bo dodalam obiekt "fghj"
		noweWyrazy = Arrays.asList(wyrazy.get(2),wyrazy.get(5)); // tworzy liste z takimi argumentami ktore sa podane
		System.out.println(noweWyrazy);
		
		List<String> copy1 = new ArrayList<String>(wyrazy);
		copy1.removeAll(noweWyrazy); // usuwanie dokladnie tego co jest w noweWyrazy
		System.out.println(copy1);
		
		copy1.set(2, "zastapiony"); // zastepowanie elementu
		System.out.println(copy1);
		
		Object tablica[] = wyrazy.toArray();// do tablicy
		System.out.println(tablica[1]);
		
	
	}
	
	
	
}
