
public class Triangle extends Shape1{
	@Override
	public void draw(){System.out.println("Triangle.draw()");}
	@Override
	public void erase(){System.out.println("Triangle.erase()");}
	Triangle(boolean flag)
	{
		this.flag = flag;
	}
	Triangle(){
		this.flag = false;
	}

}
