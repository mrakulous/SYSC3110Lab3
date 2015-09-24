import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook(){
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo aBuddyInfo){
		if(aBuddyInfo != null){
			this.buddyInfo.add(aBuddyInfo);
		}
	}
	
	public BuddyInfo removeBuddy(int index){
		if(index >= 0 && index < this.buddyInfo.size()){
			return this.buddyInfo.remove(index);
		}
		return null;
	}
	
	public static void main(String[] args){
		BuddyInfo buddy = new BuddyInfo("Jesse", "Gay St.", 101);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		
		
	}
}

//https://github.com/mrakulous/SYSC3110Lab3.git