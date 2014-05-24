import java.awt.Graphics;
import java.awt.Frame;

public class Welcome extends Frame 
{
	Welcome(String s)
	{
		super(s);
	}
	public void init()
	{
		resize(200,60);
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello World",60,45);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Wejscie do main'a");
		Welcome f = new Welcome("Welcome");
		f.init();
		f.show();
		System.out.println("wyjscie z main'a");
	}
	
}
