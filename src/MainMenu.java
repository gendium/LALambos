
public abstract class MainMenu implements Menu {
	String name;
	Menu currentMenu;
	Map<String, Runnable> menuOptions;
	
	public MainMenu()
	{
		name = "Main Menu";
		currentMenu = this;
		menuOptions = new HashMap<>();
	}
	
	public void addOption(String key, Runnable val)
	{
		menuOptions.put(key, () -> val);
	}
	
	public void removeOption(String key)
	{
		menuOptions.remove(key);
	}
	
	public void navMenu(Menu newMenu)
	{
		currentMenu = newMenu;
	}
	
	public void displayMenu()
	{
		while (true) {
        	System.out.println(name);
		for(Entry<String,Runnable> entry : menuOptions.entrySet())
		{
			String cmd = entry.getKey();
			System.out.println(cmd);
		}

        	String key = new Scanner(System.in).nextLine();

        	if (commands.containsKey(key))
            		commands.get(key).run();
        }
}
