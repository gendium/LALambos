public abstract class ChatMenu implements Menu{
	String name;
	MainMenu rootMenu;
  	ChatUser comm;
	Map<String, Runnable> menuOptions;
	
	public ChatMenu(MainMenu root, ChatMediator m, ChatUser c)
	{
		name = "Chat Menu";
		rootMenu = root;
		mediator = m;
  		comm = c;
		menuOptions = new HashMap<>();
	}
	
	public void displayMenu()
	{
		System.out.println(name);
		for(Entry<String,Runnable> entry : menuOptions.entrySet())
		{
			String cmd = entry.getKey();
			System.out.println(cmd);
		}
		while (true) {
		
        	String key = new Scanner(System.in).nextLine();

        	if (commands.containsKey(key))
		{
            		commands.get(key).run();
		}
		else
		{
			sendMessage(key);
		}
        }
	
	public void sendMessage(String key)
	{
		comm.send(key);
	}
	
	public void receiveMsg(String key)
	{
		System.out.println("[USER-" + comm.channel + "]: " + msg);
	}
		
	public void addOption(String key, Runnable val)
	{
		menuOptions.put(key, () -> val);
	}
	
	public void removeOption(String key)
	{
		menuOptions.remove(key);
	}
	
	public void quit()
	{
		System.out.println(rootMenu.name);
		rootMenu.currentMenu = rootMenu;
	}
	
}
