
public class MojeArgumenty {

	
	public static <T> void tworz(T...args)
	{

		for(T a: args)
		{
			System.out.println(a);
		}
	}
	
	
	class wewnatrz{
		private int a=9;
		private String adf = "sdff";
		
		public String toString()
		{
			return a+ adf;
		}
	}
	public static void main(String[] args)
	{
		MojeArgumenty nowy2 = new MojeArgumenty();
		tworz(2,3,5,6,4,5);
		tworz("234","@3424","2342");
		tworz(3,5,"sdfsdf");
		wewnatrz nowy = nowy2.new wewnatrz();
		wewnatrz nowy1 = nowy2.new wewnatrz();
		tworz(nowy, nowy1,5,"wersr"); // mozna wpisywac rozne typy i działa
		
	}
	
}
