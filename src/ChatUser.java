public abstract class ChatUser {
	protected ChatMediator mediator;
	protected String name;
	protected int channel;
	protected boolean is_agent;
	
	public User(ChatMediator med, String name, int channel, boolean is_agent) {
		this.mediator = med;
		this.name = name;
		this.channel = channel;
		this.is_agent = is_agent;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}
