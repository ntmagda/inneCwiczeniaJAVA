interface Selector{
	boolean end();
	Object current();
	void next();
}

public class Iterator {
	private Object[] items;
	private int next =0;
	public Iterator ( int size){items = new Object[size];}
	public void add(Object x)
	{
		if(next<items.length)
			items[next++]=x;
	}
	
private class

IteratorSelector implements Selector{
	private int i =0;
	public boolean end(){
		if(i == items.length)
			return true;
		else 
			return false;
	}
	public Object current(){
		return items[i];
	}
	public void next()
	{
		if(i<items.length)
			i++;
	}
}
	public static void main(String[] args)
	{
		
		Iterator nowy = new Iterator(7);
		for( int i =0; i <7 ; i++)
		{
			nowy.items[i] = 2*i;
		}
		IteratorSelector itek = nowy.new IteratorSelector();
		while(!itek.end())
		{
			System.out.println(itek.current());
			itek.next();
		}
		
	}
	
}