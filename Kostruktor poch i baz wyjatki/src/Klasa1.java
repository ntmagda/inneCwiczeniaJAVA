
class PierwszyException extends Exception{
	PierwszyException()
	{
		System.out.println("Wyrzucam PIerwszyException");
	}
};
class DrugiException extends Exception{
	DrugiException()
	{
		System.out.println("Wyrzucam DrugiExcpetion");
	}
};


public class Klasa1 {
	Klasa1() throws PierwszyException{
		throw new PierwszyException();
	};
	

}

class KlasaPochodna extends Klasa1{
	KlasaPochodna() throws DrugiException, PierwszyException{ // klasa pochodna nie moze obsluzyc wyjateku rzucanego z konstruktora klasy bazowej
		/*
		try{
		super(); // contructor call must be a first statement in a constructor
		}catch(PierwszyException e)
		{
			System.out.println("przechwycony");
		}*/
	}
}
