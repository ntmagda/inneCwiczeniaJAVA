
interface CanFight {
	void fight();

}

interface CanSwim{
	void swim();
}

interface CanFly{
	void fly();
}

interface CanClimb{
	void climb();
}

abstract class ActionCharacter{
	abstract public void fight();
}

class Hero extends ActionCharacter
	implements CanSwim,CanFly,CanFight, CanClimb
	{
	public void swim(){System.out.println("CanSwim.swim()");};
	public void fly(){System.out.println("CanFly.fly()");};
	public void climb(){System.out.println("CanClimb.climb()");}
	public void fight(){System.out.println("CanFight.fight()");}
	}

public class Adventure{
	public static void t(CanFight x) {x.fight();}
	public static void u(CanSwim x) {x.swim();}
	public static void v(CanFly x) {x.fly();} // rzutowanie 
 	public static void w (ActionCharacter x) { x.fight();}
	public static void main(String[] args)
	{
		Hero h = new Hero();
		t(h);
		v(h);
		u(h);
		w(h);
	}
	
}
