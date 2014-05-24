
public class Shape {

	private static RandomGenerator  gen = new RandomGenerator();
	public static void main(String[] args)
	{
		Shape1[] s = new Shape1[9];
		for ( int i =0; i < 9; i++)
		{
			s[i] = gen.next();
			s[i].draw();
			s[i].wiad();
		}
	}
}
