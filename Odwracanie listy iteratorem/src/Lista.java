
import java.util.*;
public class Lista {
	public static void main(String[] args)
	{
		List<Integer> lista = new ArrayList<Integer>();
		for ( int i =0 ; i <10; i++)
		{
			lista.add(i);
		}
		List<Integer> lista2 = new ArrayList<Integer>();
		ListIterator<Integer> itek = lista.listIterator(10);
		while(itek.hasPrevious())
		{
			lista2.add(itek.previous());
		}
		
		System.out.println(lista);
		System.out.println(lista2);
	}
	

}
