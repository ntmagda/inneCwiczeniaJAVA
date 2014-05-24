
interface exam{
	void pass();
	void fail();
}

interface labs{
	void passlab();
	void faillab();
}

interface lecture{
	void absent();
	void present();
}

interface classes extends exam,labs,lecture{
	void goodstudent();
	void badstudent();
	
}
class School1 {
	void StudentAmount(){
		System.out.println("100 Studentow");
	}
}

class School2 extends School1
	implements classes{
	
	public void pass(){System.out.println("Zdałes egzamin");}
	public void fail(){System.out.println("Oblałes egzamin");}
	public void passlab(){System.out.println("Zdałes laborki");}
	public void faillab(){System.out.println("Oblałes laborki");}
	public void absent(){System.out.println("Nieobecny na wykladach");}
	public void present(){System.out.println("Obecny na wykładach");}
	public void goodstudent(){System.out.println("Dobry student");}
	public void badstudent(){System.out.println("Zly student");}
	
	
	
}

public class School{

	public static void pass(labs x){
		x.passlab();
	}
	public static void fail(labs x){
		x.faillab();
	}
	
	public static void absent(classes x)
	{
		x.absent();
	}
	public static void goodstudent(classes x)
	{
		x.goodstudent();
	}
	
	public static void main(String[] args)
	{
		School2 nowy = new School2();
		goodstudent(nowy);
		pass(nowy);
		fail(nowy);
		absent(nowy);
	
		
	}
	
}








