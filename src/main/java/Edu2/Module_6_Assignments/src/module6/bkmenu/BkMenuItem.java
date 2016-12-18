package Edu2.Module_6_Assignments.src.module6.bkmenu;

/**
 * Each menu item for the menu.xml
 * @author pbose
 *
 */
public class BkMenuItem 
{
	protected String name = null;
	protected String price = null;
	protected String description = null;
	protected String calories = null;
	
	@Override
	public String toString() 
	{ return name + "/" + price + "/" + calories + " (" + description + ")"; }
}