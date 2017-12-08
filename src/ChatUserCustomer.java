public class ChatUserCustomer extends ChatUser {
	public ChatUserCustomer(ChatMediator med, String name, int channel) {
		super(med, name, channel, false);
	}
	
	@Override
	public void send(String msg) {
		mediator.send_message(msg, this);
	}
	
	@Override
	public void receive(String msg) {
		System.out.println("[AGENT-" + this.channel + "]: " + msg);
	}
}
