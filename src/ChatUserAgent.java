public class ChatUserAgent extends ChatUser {
	public ChatUserAgent(ChatMediator med, ChatMenu UI, String name, int channel) {
		super(med, UI, name, channel, true);
	}
	
	@Override
	public void send(String msg) {
		mediator.send_message(msg, this);
	}
	
	@Override
	public void receive(String msg) {
		UI.receive(msg);
	}
}
