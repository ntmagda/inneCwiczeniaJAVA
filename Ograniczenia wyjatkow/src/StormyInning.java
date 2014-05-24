class BaseballException extends Exception{};
class Foul extends BaseballException{};
class Strike extends BaseballException{};

abstract class Inning {
	public Inning() throws BaseballException {};
	public void Event() throws BaseballException {};
	public abstract void atBad() throws Strike, Foul;
	public void walk(){};
	
}

class StormException extends Exception{};
class RainedOut extends StormException{};
class PopFoul extends Foul{};

interface Storm
{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
	
}

public class StormyInning extends Inning implements Storm{
	
	public StormyInning() throws RainedOut, BaseballException{}; // konstruktor moze zgłaszac co tlyko chce, no bo przeciez nie jest dziedziczony
	public StormyInning(String s) throws Foul, BaseballException{};
	public void rainHard() {}; // nie musi zglasza wyjatkow
	public void event(){};
	public void atBad() throws PopFoul{}; // metoda moze wyrzucac tylko wyjatki takie jak w klasie bazowej, lub dziedziczace z klasy bazowej
	
	

}
