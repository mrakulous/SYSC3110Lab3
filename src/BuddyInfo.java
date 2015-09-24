public class BuddyInfo {
	
	private String name;
	private String phoneNum;
	private int studentID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int ID) {
		this.studentID = ID;
	}
	
	public BuddyInfo(String name, String phoneNum, int ID){
		if(name != null){
			this.name = name;
		}
		
		if(phoneNum != null){
			this.phoneNum = phoneNum;
		}
		
		this.studentID = ID;
	}

	public static void main(String[] args) {
		
		BuddyInfo buddy = new BuddyInfo("Mark", "Goon St.", 911);

		System.out.println("Hello " + buddy.getName());
	}

}
