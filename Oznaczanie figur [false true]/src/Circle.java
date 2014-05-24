
public class Circle extends Shape1{
	@Override
	public void draw(){System.out.println("Circle.draw()");}
	@Override
	public void erase(){System.out.println("Circle.erase()");}
	Circle(boolean flag)
	{
		this.flag = flag; // oznaczanie Koła
	}
	Circle()
	{
		this.flag = false;
	}
}
