
public class intclass 
{
	public static void main(String[] args)
	{
		int a = 0x7fffffff;
		System.out.println("Najwieksza liczba int: " +a);
		long b = (long)4*a;
		long c= 4*a;
		System.out.println("Jeszcze wieksza liczba z rzutowaniem: " + b);
		System.out.println("Jeszcze wieksza liczba bez rzutowania: " +c); // błąd
	}
}
