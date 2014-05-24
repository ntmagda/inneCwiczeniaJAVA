import java.util.*;
public class PetCounter extends HashMap<String,Integer> {
	public void count(String type)
	{
		Integer licznik = get(type);
		if(licznik == null)
			put(type,1); // jezeli pole w hashmapie jest puste no to jest licznik =1
		else 
			put(type, licznik+1);// jezeli jest pełne licznik = licznik +1
	}
	
	public static void CountPets( PetCreator creator)
	{
		PetCounter counter = new PetCounter();
		
		for(Pet pet : creator.createArray(20))
		{
//		zliczanie 
		
	}

}
