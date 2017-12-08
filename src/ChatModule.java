public class ChatModule {
	public static void main(String[] args) {
		int avail_channels[] = { 0, 1, 2 };
	
	
		ChatMediator mediator = new ChatMediatorConc();
		ChatUser agent1 = new ChatUserAgent(mediator, "Geoff", avail_channels[0]);
		ChatUser agent2 = new ChatUserAgent(mediator, "Jeff", avail_channels[1]);
		ChatUser agent3 = new ChatUserAgent(mediator, "Jeffrey", avail_channels[2]);
		
		ChatUser customer1 = new ChatUserCustomer(mediator, "Megan", avail_channels[0]);
		ChatUser customer2 = new ChatUserCustomer(mediator, "Hank", avail_channels[1]);
		ChatUser customer3 = new ChatUserCustomer(mediator, "Steve", avail_channels[2]);
		
		mediator.add_user(agent1);
		mediator.add_user(agent2);
		mediator.add_user(agent3);
		mediator.add_user(customer1);
		mediator.add_user(customer2);
		mediator.add_user(customer3);
	
		// communication happens here
		agent1.send("potato");
	}
}
