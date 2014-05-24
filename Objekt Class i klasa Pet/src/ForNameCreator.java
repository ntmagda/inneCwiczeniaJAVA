import java.util.*;
public class ForNameCreator extends PetCreator{
	
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();	
	private static String[] typeNames = // nazwy typow
		{
		"Cymric",
		"EgipskiKot",
		"Hamster",
		"Jamnik",
		"Manx",
		"Owczarek",
		"Mouse",
		"Rat",		
		};
	
	private static void loader()
	{
		try{
			for(String name: typeNames)
			{
				types.add((Class<? extends Pet>)Class.forName(name));
			}
		}catch(Exception e)
			{
				System.out.println("Wyjatek: ");
				e.printStackTrace();
			}
		}
	static
	{
		loader(); // ładuje typy do listy
	}
	public List<Class<? extends Pet>> types(){return types;} // zwraca liste z typami
}
