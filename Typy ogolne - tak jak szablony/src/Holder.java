
public class Holder<T> {
	
	private T a;
	private T b;
	private T c;
	public Holder(T a, T b, T c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public T geta(){
		return a;
	}
	public T getb(){
		return b;
	}
	public T getc()
	{
		return c;
	}
	public static void main(String[] args)
	{
		Holder<Integer> nowy = new Holder<Integer>(7,8,4);
		System.out.println(nowy.getb());
	}

}
