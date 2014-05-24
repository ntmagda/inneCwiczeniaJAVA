
public class Square extends Shape1 {
	@Override
	public void draw(){System.out.println("Square.draw()");}
	@Override
	public void erase(){System.out.println("Square.erase()");}
	public void wiad(){
		System.out.println("wiadomosc od square");
	}
	Square(boolean flag)
	{
		this.flag = flag;
	}
	Square()
	{
		this.flag = false;
	}
}
