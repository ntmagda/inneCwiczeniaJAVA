
import java.util.*;
public abstract class PetCreator {

	Random rand = new Random(47);
	//Lista roznych obiektow Pet
	public abstract List<Class<? extends Pet>> types();
	public Pet randomPet()
	{
		int n = rand.nextInt(types().size()); // tyle liczb do losowania ile jest typow zwierzat
		try{
			return types().get(n).newInstancre(); // 
		}catch(Exception e)
		{
			System.out.println("Wystapil wyjatek: ");
			e.printStackTrace();
			return null;
		}
		
				
	}
	public Pet[] createArray( int size) // utworzenie tablicy zwierzakow
	{
		Pet[] result = new Pet[size];
		for ( int i =0 ; i <size ; i++)
		{
			result[i] = randomPet();
			
		}
		return result;
	}
	public ArrayList<Pet> tablica(int size) // zamiana zwyklej tablicy na ArrayList
	{
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size)); 
		return result;
	}
	
}
