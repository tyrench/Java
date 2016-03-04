
public class Inventory 
{
	private String description;
	private int units;
	
	public Inventory()
	{
		description = "";
		units = 0;
	}
	
	public Inventory(Inventory obj)
	{
		description = obj.description;
		units = obj.units;
	}
	
	public Inventory(String d)
	{
		description = d;
		units = 0;
	}
	
	public Inventory(String d, int u)
	{
		description = d;
		units = u;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
	
	
}
