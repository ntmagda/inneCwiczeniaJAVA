import java.util.*;
public class Generator {

	private Random rand = new Random();
	public Gryzon next(){
		switch(rand.nextInt(3)){
		default:
		case 0: return new Chomik();
		case 1: return new Swinka();
		case 2: return new Mysz ();
		}
	}
}
