public abstract class ChatUser {
	protected ChatMediator mediator;
	protected ChatMenu UI;
	protected String name;
	protected int channel;
	protected boolean is_agent;
	
	public ChatUser(ChatMediator med, ChatMenu menu, String name, int channel, boolean is_agent) {
		this.mediator = med;
		this.UI = menu
		this.name = name;
		this.channel = channel;
		this.is_agent = is_agent;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}
