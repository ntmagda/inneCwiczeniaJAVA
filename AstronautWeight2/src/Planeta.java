import java.io.DataInputStream;
class Astronaut
{
	Double earthweight;
	
	Astronaut(Double weight)
	{
		earthweight = new Double(weight);
	}
	
	public double moonweight()
	{
		return earthweight.doubleValue() *0.66;
		
	}
	
}
public class Planeta {
	Astronaut armstrong;
	
	void CalculateWeight()
	{
		armstrong = new Astronaut(getEarthWeight());
		showMoonWeight(armstrong.moonweight());
		
	}
	
	double getEarthWeight()
	{
		double earthweight;
		DataInputStream stream = new DataInputStream(System.in);
		String str;
		System.out.println("Ile wazysz na ziemi?");
		try
		{
			str = stream.readLine();
			
		}catch(java.io.IOException e)
		{
			str = "0.0";
		}
		try
		{
			earthweight = Double.valueOf(str).doubleValue();
			
		}catch(java.lang.NumberFormatException e)
		{
			earthweight = 0.0;
		}
		
		return earthweight;
		
	}
	
	void showMoonWeight(double weight)
	{
		System.out.println("Na ksiezycu wazysz:" + String.valueOf(weight));
		
	}

	public static void main(String[] args)
	{
		Planeta nowa = new Planeta();
		nowa.CalculateWeight();
	}
}
