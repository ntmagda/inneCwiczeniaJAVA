
class Moja{
	int a=9;
	Moja(){}
	Moja( int s)
	{
		a=s;
	}
	public String toString()
	{
		return Integer.toString(a);
	}
}

public class test {

	public static void main(String[]args)
	{
	try{
		Class c = Class.forName("Moja");
		Object a = c.newInstance();
		System.out.println(a);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	}
