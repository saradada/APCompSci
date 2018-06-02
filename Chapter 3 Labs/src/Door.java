
public class Door {
	private String state;
	private String name;
	
	public Door(String doorName,String doorState) {
		state = doorState;
		name = doorName;
	}
	
	public void Open() {
		state = "open";
	}
	public void Close() {
		state = "close";
	}
	
	public String getName()
	{
	   return name;
	}
	
	public String getState()
	{
	   return state;
	}
	
	public void setName(String newName)
	{
	   name = newName;
	}
	
	public void setState(String newState)
	{
	   state = newState;
	}
}
