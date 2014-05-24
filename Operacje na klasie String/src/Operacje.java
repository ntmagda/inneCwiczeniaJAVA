
public class Operacje {

	public static void main(String[] args)
	{
		
		String a = new String(); // bezargumentowy 
		System.out.println(a); // nic nie wypisze
		String b = new String(new StringBuilder("alala")); // z obiektem StringBuilder
		System.out.println(b);
		String c = new String(new StringBuffer ("alala")); // z obiektem StringBuffer
		System.out.println(c);
		char[] array = {'s', 'b', 'c'};
		String d = new String(array);
		System.out.println(d); // polaczy s+b+c = sbc
		byte[] arrayb = {0,1,0}; // dokonca nie wiem jak to z nia
		String e = new String(arrayb);
		System.out.println(e);
		String f = new String("dsfgh");
		System.out.println(f.length()); // zwraa dlugosc ciagu
		System.out.println(f.charAt(3)); // traktujr stringa jak tablice charow i zwraca element o indeksie 3
		char[] g = {'a','a','a'};
		f.getChars(2, 3, g, 0);
		System.out.println(f);
		System.out.println(g); // do tablicy g wstawiło mi litery z zakresu podanego w getChars
		String t = "alalalala";
		char[] h = t.toCharArray();
		System.out.println(h[5]);
		System.out.println(t.equals("alalala"));
		System.out.println(t.equalsIgnoreCase("alALalaLa")); // ignoruje wielkosc liter
		System.out.println(t.compareTo("ALALALALA")); // jak bardzo rozne, taki jakby wspolczynnik czy cos
		System.out.println(t.contains("lk")); // czy zawiera taki ciag znakow w sobie
		System.out.println(t.endsWith("la")); // czy sie konczy tym wyrazem
		System.out.println(t.indexOf("la")); // od ktorego miejsca stringu sie zaczyna ten wyraz
		System.out.println(t.concat("dodane")); // dodaje do ciagu 
		String k = "    dff   ghj   ";
		System.out.println(k.trim()); // zwraca bez spacji na koncu i poczatku
		System.out.println(String.valueOf(array));
		
		
		
		
	}
}
