import java.util.*;
import java.nio.*;
public class Adapter extends Generator
	implements Readable{
	int count;
	
	public Adapter(int counts)
	{
		this.count = counts;
	}
	public int read(CharBuffer cb)
	{	
		if(count-- == 0) return -1;
		String result = Character.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(new Adapter(10));
		while(s.hasNext())
			System.out.println(s.next() + " ");
	}
	}