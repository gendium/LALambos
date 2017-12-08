public class ChatUserCustomer extends ChatUser {
	public ChatUserCustomer(ChatMediator med, ChatMenu UI, String name, int channel) {
		super(med, UI, name, channel, false);
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
