interface Inter{
	void work();
	void work2(String arg);
}


class Obiekt implements Inter
{
	public void work()
	{
		System.out.println("work()");
	}
	public void work2(String arg)
	{
		System.out.println("work2()" + arg);
	}
}

class Proxy implements Inter
{
	private Inter proxy;
	public Proxy(Inter proxied)
	{
		proxy = proxied;
	}
	public void work()
	{
		System.out.println("Proxy work()");
		proxy.work();
	}
	public void work2(String arg)
	{
		System.out.println("Proxy work2()" +  arg);
		proxy.work2(arg);
	}
}

public class ProxyDemo {

	public static void klient (Inter interfejs)
	{
		interfejs.work();
		interfejs.work2("costam");
	}
	
	public static void main(String[] args)
	{
		
		klient(new Obiekt());
		klient(new Proxy(new Obiekt()));
	}
}
