
public class SpadekTemperatury extends SzklarniaController.Temperatura
{
	
	SpadekTemperatury(SzklarniaController wi, long delayTime)
	{
		wi.super(delayTime);
	}



public static void main(String[] args)
{
	SzklarniaController szklarnia = new SzklarniaController();
	SpadekTemperatury temp = new SpadekTemperatury(szklarnia,3456);
	temp.action();
	
}
}
