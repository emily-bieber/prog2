package aufgaben.aufgabe7;

import java.util.*;

public class Slack implements Publisher
{
	private Set<Listener> listeners;
	private int nrOfMessages;
	
	public Slack()
	{
		this.listeners = new HashSet<>();
		this.nrOfMessages = 0;
	}

	@Override
	public boolean register(Listener listener) 
	{
		return this.listeners.add(listener);
	}

	@Override
	public boolean unregister(Listener listener) 
	{
		return this.listeners.remove(listener);
	}

	@Override
	public void notifyListeners() 
	{
		for (Listener listener : listeners)
		{
			listener.update();
		}
	}

	@Override
	public String getUpdate(Listener listener) 
	{
		return "Breaking News " + this.nrOfMessages;
	}
	
	public void publishNews()
	{
		this.nrOfMessages++;
		this.notifyListeners();
	}

}
