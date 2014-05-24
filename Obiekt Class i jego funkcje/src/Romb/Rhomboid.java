package Romb;
import java.util.*;

class Shape{
	double wysokosc;
	double szerokosc;
	double przekatna;
	Shape()
	{
		wysokosc = szerokosc = przekatna = 1;
	}
	Shape(double wys, double szer, double prze)
	{
		wysokosc = wys;
		szerokosc = szer;
		przekatna = prze;
	}
	
	public String toString()
	{
		return "wysokosc: " + wysokosc +"\n" +
				"szerokosc: " + szerokosc + "\n"+
				"przekatna: " + przekatna;
				
		
	}
}

class Romb extends Shape{
	double pole_pow;
	Romb()
	{
	super();
	}
	Romb (double wys, double szer, double prze, double pole)
	{
		super(wys,szer,prze);
		pole_pow = pole;
	}
	public String toString()
	{
		return "wysokosc: " + wysokosc +"\n" +
				"szerokosc: " + szerokosc + "\n"+
				"przekatna: " + przekatna + "\n"+
				"pole powierzchni: " +  pole_pow + "\n";
	}
}

class Circle extends Shape{
	double srednica; 
	Circle()
	{
		super();
	}
	Circle(double sr){
		super(sr,sr,sr);
		srednica = sr;
	}
	public String toString()
	{
		return "wysokosc: " + wysokosc +"\n" +
				"szerokosc: " + szerokosc + "\n"+
				"przekatna: " + przekatna + "\n"+
				"srednica: " +  srednica;
	}
}
public class Rhomboid{
	
	static Shape rotate(Shape a)
	{
		if(a instanceof Circle)
			{
			System.out.println("nie wykonam metody");
			return null;
			}
		System.out.println("Metoda wykonana");
		return new Shape(a.przekatna, a.szerokosc, a.wysokosc);
	}
	
	public static void main(String[] args)
	{
		List<Shape> lista = new ArrayList<Shape> ();
		lista.add(new Romb(5,3,4,7));
		lista.add(new Circle(46));
		System.out.println(lista.toString());
		System.out.println("ddddddddddddddddddd");
		for(Shape shape : lista)
		{
			Shape rotated = rotate(shape);
			/*if(shape instanceof Romb && rotated instanceof Romb)
				{
				System.out.println("Zwykły: ");
				System.out.println(((Romb)shape).toString()); // nie mozna rzutowac circle na romba
				System.out.println("Obrocony: ");
				System.out.println(((Romb)rotated).toString()); 
				}
				else*/
				System.out.println("Zwykły: ");
				System.out.println(shape.toString());
				if(!(shape instanceof Circle))
				{
				System.out.println("Obrocony: ");
				System.out.println(rotated.toString());
		}
				}
		
	}
	


	
}
