
public interface Mediator {
  
    void send_message(String msg, ChatUser user);
	
	void add_user(ChatUser user);
	
	void remove_user(ChatUser user);
}
