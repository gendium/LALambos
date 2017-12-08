
public abstract class AppMenu implements Menu{
	MainMenu rootMenu;
	List<RentalStore> storeList;
	List<String> menuOptions;
	
	addStore(RentalStore newStore)
	{
		storeList.add(newStore);
	}
	
	removeStore(RentalStore oldStore)
	{
		storeList.remove(oldStore);
	}
	
	quit()
	{
		rootMenu.currentMenu = rootMenu;
	}
	
}
