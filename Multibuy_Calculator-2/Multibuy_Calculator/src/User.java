import java.util.ArrayList;

public class User {
	String name;
	String startdate;
	int userID;
	int uplineID;
	int amountOfPackets;
	
	ArrayList<User> users = new ArrayList<>();
	
	public User(){
		
	}
	
	
	public User(String name, String startdate, int userID, int amountOfPackets){
		this.name = name;
		this.startdate = startdate;
		this.userID = userID;
		this.uplineID = 4999;
		this.amountOfPackets = amountOfPackets;
		//users.add
	}
	
	
	
	public User(String name, String startdate, int userID, int uplineID, int amountOfPackets){
		this.name = name;
		this.startdate = startdate;
		this.userID = userID;
		this.uplineID = uplineID;
		this.amountOfPackets = amountOfPackets;	
	}
	
	
	public ArrayList<User> getUsers(){
		return users;
		
	}
	
	
}
