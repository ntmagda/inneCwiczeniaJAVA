
public class Cycle {
	 int WheelAmount;
	 double forward;
	 
	 public void balance()
	 {
		 System.out.println("Cycle.balance()");
	 }
	 public static void ride(Cycle a)
	 {
		 a.forward += 100;
	 }
	 public static void rideBack(Cycle a)
	 {
		 a.forward-= 50;
	 }
	 
	 public static void main(String[] args)
	 {
		 Cycle pojazd = new Cycle();
		 Cycle bicykl = new Bicycle();
		 Cycle unicykl = new Unicycle();
		 Cycle trycykl = new Tricycle();
		 ride(pojazd);
		 ride(bicykl);
		 ride(unicykl);
		 ride(trycykl);
		 rideBack(unicykl);
		 System.out.println("Pojazd: " + pojazd.forward);
		 System.out.println("Bicykl: " + bicykl.forward);
		 System.out.println("Unicykl: " + unicykl.forward);
		 System.out.println("Trycykl: " + trycykl.forward);
		 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		 Cycle[] tablica = new Cycle[10];
		 for( int i=0; i < 10; i++)
		 {
			 if(i==2 || i==4 || i ==6)
			 {
				 tablica[i]= new Bicycle();
				 System.out.println("dfgh");
			 }
			 else if(i==0 || i==3 || i ==7 )
			 {
				 tablica[i]= new Unicycle();
			 }
			 else if(i==1 || i==9)
			 {
				 tablica[i] = new Tricycle();
			 }
			 else
			 {
				 tablica[i] = new Cycle();
			 }
		 }
		 
		 
		 for ( int i=0; i <10; i++)
		 {
			 tablica[i].balance();
		 }
		 
	 }
}

class Unicycle extends Cycle{

	Unicycle(){
		WheelAmount = 1;
	}
	public void balance()
	{
		System.out.println("Unicycle.balance()");
	}
}

class Bicycle extends Cycle{
	Bicycle(){
		WheelAmount = 2;
	}

	public void balance()
	{
		System.out.println("Bicycle.balance()");
	}
	
}
class Tricycle extends Cycle{
	Tricycle()
	{
		WheelAmount = 3;
	}
	
}


