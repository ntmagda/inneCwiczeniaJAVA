
public class Music {

	public static void tune(Instrument i)
	{
		i.play(Note.C_MIDDLE);
		
	}
	public static void main(String[] args)
	{
		Wind flute = new Wind();
		tune(flute);
		Bass bass = new Bass();
		tune(bass);
		}
}
