import java.util.*;

public class Generator<T> {
	
	private Class<T> typ;
	public Generator(Class<T> typ)
	{
		this.typ = typ;
	}
	public T next()
	{
		try{
		return typ.newInstance();
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	

}
