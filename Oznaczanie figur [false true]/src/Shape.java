
public class Shape {

	private static RandomGenerator  gen = new RandomGenerator();
	public static void setFlag(Shape1 a)
	{
		if( a instanceof Triangle)
			((Triangle) a).flag = true;
	}
	public static void main(String[] args)
	{
		Shape1[] s = new Shape1[9];
		for ( int i =0; i < 9; i++)
		{
			s[i] = gen.next();
			s[i].draw();
			s[i].wiad();
			setFlag(s[i]);
			System.out.println(s[i].toString());
		}
	}
}
