
public class Szafka {
	int IloscKsiazekNaPulce;
	int IloscPulek;
	int IloscKsiazek(){return IloscPulek *IloscKsiazekNaPulce;};
	int IloscKsiazek(int i) { return i;}
	Szafka(){};
	Szafka(int i, int j)
	{
		IloscKsiazekNaPulce = i;
		IloscPulek = j;
	}



public static void main(String[] args)
{
	Szafka szafka1 = new Szafka();
	Szafka szafka2 = new Szafka(4,5);
	Szafa szafa1 = new Szafa();
	System.out.println(szafka1.IloscKsiazek());
	System.out.println(szafka2.IloscKsiazek());
	System.out.println(szafka1.IloscKsiazek(5));
	System.out.println(szafa1.IloscKsiazek(8,4));
}
}

class Szafa extends Szafka{
	int IloscKsiazek(int i, int j){
	return i*j;
	}
	Szafa(){}
}