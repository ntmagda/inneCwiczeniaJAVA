package apply;
import java.util.*;
public class Apply {
	public static void process(Processor p, Object s)
	{
		System.out.println("Uzywam procesora: " + p.name());
		System.out.println(p.process(s));
	}
	public static String s= "Idzie Grzes przez wies worek piasku niesie";
	public static void main(String[] args)
	{
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new Splitter(),s);
	}

}

interface Processor{
	public String name();

	Object process(Object input);

}

class Upcase implements Processor{
	public String name(){
		return getClass().getName();
	}
	public String process(Object input)
	{
		return ((String)input).toUpperCase();
	}
}

class Downcase implements Processor{
	
	public String name(){
		return getClass().getName();
	}
	public String process(Object input)
	{
		return ((String)input).toLowerCase();
	}
}

class Splitter implements Processor{
	public String name(){
		return getClass().getName();
	}
	public String process(Object input)
	{
		return Arrays.toString(((String)input).split(" "));
	}
}

