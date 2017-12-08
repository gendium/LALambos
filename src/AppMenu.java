
public abstract class AppMenu implements Menu{
	String name;
	MainMenu rootMenu;
	List<RentalStore> storeList;
	Map<String, Runnable> menuOptions;
	
	public AppMenu(MainMenu root)
	{
		name = "Application Menu";
		rootMenu = root;
		storeList = new List<RentalStore>;
		menuOptions = new HashMap<>();
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
		
	public void addOption(String key, Runnable val)
	{
		menuOptions.put(key, () -> val);
	}
	
	public void removeOption(String key)
	{
		menuOptions.remove(key);
	}
	
	public void addStore(RentalStore newStore)
	{
		storeList.add(newStore);
	}
	
	public void removeStore(RentalStore oldStore)
	{
		storeList.remove(oldStore);
	}
	
	public void quit()
	{
		System.out.println(rootMenu.name);
		rootMenu.currentMenu = rootMenu;
	}
	
}
