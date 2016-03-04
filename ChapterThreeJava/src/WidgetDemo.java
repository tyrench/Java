
public class WidgetDemo 
{
	public static void main(String[] args)
	{
		Widget w = new Widget();
		
		w.setNumWidgets(240);
		
		System.out.println("It would take " + w.getDaysToProduce() + " days to produce 1500 widgets");
	}
}
