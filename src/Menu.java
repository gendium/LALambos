import java.util.*;
import java.String;
public interface Menu {
	Menu rootMenu;
	Map<String, Runnable> menuOptions;
	
	void displayMenu();
	void addOption(String, Runnable);
	void removeOption(String);
	void quit();
}
