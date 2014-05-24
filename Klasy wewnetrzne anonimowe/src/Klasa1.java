
interface Klasa2{
	int value();
}

public class Klasa1 {
	public Klasa2 klasa2(int x)
	{
		return(new Klasa2(x){
			private int i =100;
			public int value(){return super.value;}
		});
	}
	
	public static void main(String[] args)
	{
		Klasa1 a = new Klasa1();
		Klasa2 b = a.klasa2();
		
	}

}////////////???????????
