
class Astronaut
{
	Double weight;
	Astronaut (double weight)
	{
		this.weight = new Double(weight);
	}	
	public double moonweight()
	{
		return weight*0.166;
	}
}

public class Planeta 
{
	Astronaut armstrong;
	
	public static void main(String[] args)
	{
		char c;
		double weight;
		StringBuffer str = new StringBuffer();
		double moonweight;
		Astronaut armstrong;
		System.out.println("Ile wazysz na ziemi?");
		
		try
		{
			while((c=(char) System.in.read())!= '\n')
				str.append(c);
			weight = Double.valueOf(str.toString()).doubleValue();
		}catch(java.io.IOException e)
		{
			weight = 0.0;
		}
		armstrong = new Astronaut(weight);
		System.out.println("Na ksiezycu wazysz:"+ armstrong.moonweight());
		
		
	}

	
}
