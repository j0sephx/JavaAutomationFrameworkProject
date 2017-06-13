package pageUtilities;


public abstract class Page
{
	protected String name;
	
	protected Page(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
