package Cwiczenie1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestRegularExpresion {

	public static void main(String[] args)
	{
		if(args.length<2)
		{
			System.out.println("Stosowanie:\njava TestRegularExpresion"+ "ciagi znakow wyrazenieregularna+" );
			System.exit(0);
		}
		System.out.println("WEjscie: \""+args[0]+"\"");
		for(String arg : args)
		{
			System.out.println("Wyraznie regularne: \"" + args +"\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while(m.find())
			{
				System.out.println("Dopasowanie \"" + m.group() + "\" na pozycjach" + m.start()+"-" +(m.end()-1));
			}
			

		}
	}
}
