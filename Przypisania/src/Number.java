class Liczba 
{
		int i;
};

public class Number{
public static void main(String [] args)
{
	Liczba n1 = new Liczba();
	Liczba n2 = new Liczba();
	n1.i=10;
	n2.i=20;
	System.out.println("pierwsze wywolanie");
	System.out.println("n1:" + n1.i);
	System.out.println("n2:" + n2.i);
	n1.i=n2.i;
	n1.i=4;
	System.out.println("drugie wywolanie");
	System.out.println("n1:" + n1.i);
	System.out.println("n2:" + n2.i);
	
	
};
};
