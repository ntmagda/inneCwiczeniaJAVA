
public class Node<T> {
	
	// skladniki klasy node 
	T item; // jakis obiekt
	Node<T> next; // obiekt nastepny
	Node(){ // konstruktor domyslny - tworzy pusty wezel
		item = null;
		next = null;
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
	Node<T> top = new Node<T>(); // ostatni element listy
	
	public void push(Node<T> item){ // wstawia element na koniec listy
		if(top.item!=null)
		{
			top.next = item;
			item.next = null;
		}
		else {
			top.item = item.item;
			top.next = null;
		}
	}
	
	public Node<T> pop() // zwraca ostatni element listy i przypisuje do topa 
	{
		Node<T> result = top;
		if(result.next!= null)
		{
			result = result.next;
		}
		top = result;
		return result;
	}
	

}
