
public class StatekDelegation {

	private String name;
	private SystemKontrolny control = new SystemKontrolny();
	public StatekDelegation(String name){
		this.name = name;
	}
	public void back( int wartosc)
	{
		control.back(wartosc);
	}
	public void up( int wartosc)
	{
		control.up(wartosc);
	}
	public void down( int wartosc)
	{
		control.down(wartosc);
	}
	public void forward( int wartosc)
	{
		control.forward(wartosc);
	}
	public void right( int wartosc)
	{
		control.right(wartosc);
	}
	public void left( int wartosc)
	{
		control.left(wartosc);
	}

public static void main(String[] args)
{
	StatekDelegation alfa = new StatekDelegation("alfa");
	alfa.down(300);
	System.out.println(alfa.control.Up);
}
}