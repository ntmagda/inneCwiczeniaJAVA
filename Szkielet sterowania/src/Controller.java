
import java.util.*;
public class Controller {

	private List<Event> eventList  = new ArrayList<Event>();
	public void addEvent(Event a) {eventList.add(a);}
	public void run()
	{
		while(eventList.size()>0)
		{
			for(Event e : new ArrayList<Event>(eventList)) // utworzenie kopii eventList
			{
				if(e.ready())
				{
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
	
}
