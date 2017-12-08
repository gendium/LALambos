import java.util.List;
import java.util.ArrayList;

public class ChatMediatorConc implements ChatMediator {
	private List<ChatUser> agents;
	private List<ChatUser> customers;
	
	public ChatMediatorConc() {
		this.customers = new ArrayList<ChatUser>();
	}
	
	@Override
	public void add_user(ChatUser user) {
		this.customers.add(user);
	}
	
	@Override
	public void remove_user(ChatUser user) {
		this.customers.remove(user);
	}
	
	@Override
	public void send_message(String msg, User user) {
		List<ChatUser> relevant_list;
		
		// Determine what type of user we are broadcasting to
		if (user.is_agent) {
			relevant_list = this.customers;
		}
		else {
			relevant_list = this.agents;
		}
		
		// Broadcast to linked user
		for (ChatUser u : relevant_list) {
			if (u.channel == user.channel) {
				u.receive(msg);
			}
		}
	}
}
