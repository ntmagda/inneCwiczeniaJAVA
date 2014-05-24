
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Input {

	static int licznik;
	public static void main(String[] args) {
		
		// Pobieram zdanie.
		Scanner skaner = new Scanner(System.in);
		String zdanie = skaner.nextLine();
		double mutacja = Double.parseDouble(skaner.nextLine());
		//Próby wszelkie.
		
		ArrayList<char[]> kandydaci = Losuj(ZmienNaTablice(zdanie), mutacja);
		char [] kandydat = WybierzNajlepszy(kandydaci, ZmienNaTablice(zdanie));
		String wynik = 	SprawdzILosujDalej(kandydat, ZmienNaTablice(zdanie), mutacja);
		
		System.out.print(wynik);
		System.out.println();
		System.out.print(licznik);
		
				
	}
	
	public static char[] ZmienNaTablice (String sentence) {
		
		// Dzielê zdanie na znaki i umieszczam je w ArrayList.
		char[] znaki = sentence.toCharArray();
		// Zwracam tablicê znaków.
		return znaki;
	}
	
	
	
	public static ArrayList<char[]> Losuj (char [] symbole, double mutacja) {
		
		// Tworzê piêæ tablic.
		char [] losowa1 = new char [symbole.length];
		char [] losowa2 = new char [symbole.length];
		char [] losowa3 = new char [symbole.length];
		char [] losowa4 = new char [symbole.length];
		char [] losowa5 = new char [symbole.length];
		// Tworzê randomowe wartoci.
				// Do losowania znaków.
		Random r = new Random();
		// 
		
		// Wype³niam tablicê znakami z u¿yciem wspó³czynnika mutacji.
				//Pierwsz¹.
		for (int i=0; i<losowa1.length; i++) {
			if 			(losowa1[i]==symbole[i]) {}
			else		{double p = Math.random();
						if (mutacja>p){
						String alphabet = "a¹bcædeêfghijkl³mnñoópqrstuwxyz¿ ";
			 			losowa1[i]=(alphabet.charAt(r.nextInt(alphabet.length())));
			 			}
						else {}
						}}
				//Drug¹.
		for (int i=0; i<losowa2.length; i++) {
			if 		(losowa2[i]==symbole[i]) {}
			else		{double p = Math.random();
						if (mutacja>p){
						String alphabet = "a¹bcædeêfghijkl³mnñoópqrstuwxyz¿ ";
						losowa2[i]=(alphabet.charAt(r.nextInt(alphabet.length())));
						}
						else {}
						}}
				//Trzeci¹.
		for (int i=0; i<losowa3.length; i++) {
			if 		(losowa3[i]==symbole[i]) {}
			else		{double p = Math.random();
						if (mutacja>p){
						String alphabet = "a¹bcædeêfghijkl³mnñoópqrstuwxyz¿ ";
						losowa3[i]=(alphabet.charAt(r.nextInt(alphabet.length())));
						}
						else {}
						}}
				//Czwart¹.
		for (int i=0; i<losowa4.length; i++) {
			if 		(losowa4[i]==symbole[i]) {}
			else		{double p = Math.random();
						if (mutacja>p){
						String alphabet = "a¹bcædeêfghijkl³mnñoópqrstuwxyz¿ ";
						losowa4[i]=(alphabet.charAt(r.nextInt(alphabet.length())));
						}
						else {}
						}}
				//Pi¹t¹
		for (int i=0; i<losowa5.length; i++) {
			if 		(losowa5[i]==symbole[i]) {}
			else		{double p = Math.random();
						if (mutacja>p){
						String alphabet = "a¹bcædeêfghijkl³mnñoópqrstuwxyz¿ ";
						losowa5[i]=(alphabet.charAt(r.nextInt(alphabet.length())));
						}
						else {}
						}}
		
		// Umieszczam je w ArrayList jako tablicê tablic :)
		ArrayList<char[]> kandydaci = new ArrayList<char[]>();
		kandydaci.add(losowa1);
		kandydaci.add(losowa2);
		kandydaci.add(losowa3);
		kandydaci.add(losowa4);
		kandydaci.add(losowa5);
				
		return kandydaci;
	}
	public static char [] WybierzNajlepszy (ArrayList<char[]> ochotnicy, char [] charsy) {
		// Wypisujê tablice zawarte w ArrayList.
		char [] kandydat1 = ochotnicy.get(0);
		char [] kandydat2 = ochotnicy.get(1);
		char [] kandydat3 = ochotnicy.get(2);
		char [] kandydat4 = ochotnicy.get(3);
		char [] kandydat5 = ochotnicy.get(4);
		// Wyliczam dopasowania w ka¿dej.
				// Pierwsza
		int j = 0;
		for (int i=0; i<kandydat1.length; i++){
			if (kandydat1[i]==charsy[i]){
				j++;}
			}
				// Druga
		int k = 0;
		for (int i=0; i<kandydat2.length; i++){
			if (kandydat2[i]==charsy[i]){
				k++;}
			}
				// Trzecia
		int l = 0;
		for (int i=0; i<kandydat3.length; i++){
			if (kandydat3[i]==charsy[i]){
				l++;}
			}
				// Czwarta
		int m = 0;
		for (int i=0; i<kandydat4.length; i++){
			if (kandydat4[i]==charsy[i]){
				m++;}
			}
				// Pi¹ta
		int n = 0;
		for (int i=0; i<kandydat5.length; i++){
			if (kandydat5[i]==charsy[i]){
				n++;}
			}
		// Porównanie - umieszczam je w tablicy, która poka¿e mi najwiêksz¹.
		int [] wyborZwyciezcy = {j,k,l,m,n};
		int max = 0;
		char[] zwyciezca = null;
		for (int x=0; x<wyborZwyciezcy.length; x++) {
			if (wyborZwyciezcy[x]> max) {max = wyborZwyciezcy[x];
				if 		(x==0) {zwyciezca = kandydat1;}
				else if (x==1) {zwyciezca = kandydat2;}
				else if (x==2) {zwyciezca = kandydat3;}
				else if (x==3) {zwyciezca = kandydat4;}
				else if (x==4) {zwyciezca = kandydat5;}
				
		}}
		licznik++;
		return zwyciezca ;
		}
	public static String SprawdzILosujDalej (char [] kandydat,  char [] sukces, double wspolczynnik){
		int i = 0;
		String koniec = "To nie jest to.";
		// Tworzê zmienn¹ prawda/fa³sz.
		boolean zwyciestwo;
		
		// Wprowadzam warunek dla zmiennej.
		if (kandydat[i]==sukces[i]){
			zwyciestwo = true;
			koniec = "KONIEC - Ma³pka napisa³a ¿¹dany tekst!";
		}
		else {zwyciestwo = false;}
		
		// Tworzê pêtlê losuj¹c¹ do skutku.
		while (zwyciestwo!=true){
			
			ArrayList<char[]> wynikilosowania = Losuj(kandydat, wspolczynnik);
			kandydat = WybierzNajlepszy(wynikilosowania, sukces);
			
			}
		
			return koniec;
			
		}
	}


	


