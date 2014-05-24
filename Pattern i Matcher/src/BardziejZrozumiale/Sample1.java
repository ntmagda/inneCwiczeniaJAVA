package BardziejZrozumiale;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Sample1 {
	public static void main(String[] args)
	{
		String regex = "^[A-Z].*[.]$";
		Pattern pattern = Pattern.compile(regex);
		String txt = "Ala.3";
		Matcher matcher = pattern.matcher(txt);
		boolean a = matcher.matches();
		System.out.println(a);
	}

}
