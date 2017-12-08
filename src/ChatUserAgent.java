public class ChatUserAgent extends ChatUser {
	public ChatUserAgent(ChatMediator med, String name, int channel) {
		super(med, name, channel, true);
	}
	
	@Override
	public void send(String msg) {
		mediator.send_message(msg, this);
	}
	
	@Override
	public void receive(String msg) {
		System.out.println("[USER-" + this.channel + "]: " + msg);
	}
}
