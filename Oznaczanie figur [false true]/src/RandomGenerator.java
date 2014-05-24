import java.util.*;
public class RandomGenerator {

	private Random rand = new Random(47);
	public Shape1 next(){
		switch(rand.nextInt(3)){
		default:
		case 0: return new Circle();
		case 1: return new Triangle();
		case 2: return new Square ();
		}
	}
}
