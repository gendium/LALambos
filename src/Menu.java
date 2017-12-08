import java.util.*;
import java.String;
public interface Menu {
	Menu rootMenu;
	Map<String, Runnable> menuOptions;
	
	public abstract void displayMenu();
	public abstract void addOption(String, Runnable);
	public abstract void removeOption(String);
	public abstract void quit();
}
