
class NullException extends Exception{
	
	NullException(){};
	NullException(String info)
	{
		super(info);
	}
}

class Kot{
	private int liczbaNog;
	Kot(int i){
		liczbaNog = i;
	}
	Kot(){}
	void metoda()
	{
		System.out.println("wywoluje metode");
	}
}

public class Wyjatek{
	
	
	public static void main(String[] agrs)
	{
			Kot nowy = null;
			
			try{
				if(nowy==null)
				{
					throw new NullException("null pointer");
				}
				else
				{
					nowy.metoda();
				}
			}catch(NullPointerException e)
			{
				e.printStackTrace();
			}catch(NullException e)
			{
				e.printStackTrace();
			}
	}
}

