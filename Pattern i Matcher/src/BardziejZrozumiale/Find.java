package BardziejZrozumiale;

import java.util.regex.*;
public class Find {

	public static void main(String args[])
	{
	String regex = "[A-Z]+";
	String wejscie= "Adfgh.\\ kjfsdlf Sfdgh. dkjhkdj ASDFGHdfg.dgh sfgR";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(wejscie);
	while(matcher.find())
	{
		System.out.println("Znaleziono: "+  matcher.group());
		System.out.print(matcher.start() + "-");
		System.out.println(matcher.end());
	//	System.out.println(matcher.toString());
	}
	if(!matcher.find())
	{
		System.out.println("nie znaleziono");
	}
	
	
	
	}
}
