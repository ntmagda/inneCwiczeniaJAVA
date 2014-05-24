import java.util.*;

public class Lista<T> {

	static int count;
	private class Node<T> {
	
		// skladniki klasy node
		T item; // jakis obiekt
		Node<T> next; // obiekt nastepny
		Node<T> previous;
		Node(){ // konstruktor domyslny - tworzy pusty wezel
			item = null;
			next = null;
			previous = null;
		}
		Node(T item, Node<T> next) // konstruktor tworzy wezel o podanych argumentach
		{
			this.item = item;
			this.next = next;
		}
		Node(T item) //konstruktor tworzy wezel pojedynczy - bez nastepnego 
		{
			this.item = item;
			this.next = null;
		}
		boolean ifEnd() // sprawdza czy wezel jest wezlem ostatnim 
		{
			return (this.next == null); 
		}
		
		public String toString() // zwraca String opisujacy obiekt item
		{
			return item.toString();
		}
	}
		Node<T> top = new Node<T>(); // ostatni element listy
		Node<T> begin = new Node<T>(); // pierwszy element listy
		
		public void push(T item){ // wstawia element na koniec listy
			Node<T> wezel = new Node<T>(item);
			if(top.item!=null)
			{
				top.next = wezel;
				wezel.previous = top;
				top = top.next;
			}
			else {
				top = wezel;
				wezel.previous = null;
				begin = wezel;
			}
			count++;
		}
		
		/* void pushBegin(T item)
		{
			Node<T> wezel = new Node<T>(item);
			if()
		}*/ // dorobic pozniej, trzbea dodac znacznik previous
		
		public T pop() // zwraca ostatni element listy i przypisuje do topa 
		{
			Node<T> result = top;
			if(result.next!= null)
			{
				result = result.next;
			}
			top = result;
			return result.item;
		}
		
		public String toString()
		{
			String result = "";
			Node<T> temp = top;
			while(temp != begin)
			{
				result += (temp.toString() + "\n");
				temp= temp.previous;

			}
			result+=begin;
			return result;
			
		}
		
		public T select()
		{
			
			Random rand = new Random ();
			int a = rand.nextInt(count);
			System.out.println("Liczba losowa: " +  a);
			Node<T> temp = top;
			for ( int i =0 ; i <count; i++)
			{
				temp = temp.previous;
				if(i==a)
				{
					return temp.item;
				}
			}
				Node<T> temp2 = new Node<T>();
				System.out.println("nie udalo sie znalezc obiektu");
				return temp2.item;
			
		}
		public static void main(String[] args)
		{

			Lista<String> list = new Lista<String>();
			list.push("mama dff");
			list.push("ala");
			list.push("kopa");
			list.push("kaka");
			list.push("lalal");
			list.push("sop");
			System.out.println(list.pop());
			//System.out.println(list.begin.toString());
			System.out.println(list.toString());
			System.out.println(list.select());
			
			
		}
		
	}
	