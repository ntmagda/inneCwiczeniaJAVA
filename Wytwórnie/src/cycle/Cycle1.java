package cycle;

public class Cycle1{
	
	public static void rideCycle(CycleFactory fac)
	{
		Cycle cycl = fac.getCycle();
		cycl.ride();
	}
	
public static void main(String[] args)
{
	rideCycle(new BiFactory());
	rideCycle(new UniFactory());
	
}
	
}

interface Cycle{
	void ride();
}

class Unicycle implements Cycle{
	public void ride()
	{
		System.out.println("Unicycle.ride()");
	}
}
class Bicycle implements Cycle{
	public void ride()
	{
		System.out.println("Bicycle.ride()");
	}
}

interface CycleFactory
{
	Cycle getCycle();
}

class UniFactory implements CycleFactory
{
	public Cycle getCycle()
	{
		return new Unicycle();
	}
}
class BiFactory implements CycleFactory
{
	public Cycle getCycle()
	{
		return new Bicycle();
	}
}

