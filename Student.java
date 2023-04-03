package p1;

public class Student {
	public String Name ,Branch, RollNo;

	public Address ad = new Address();
	public Contact cd = new Contact();
	
	public void getStudent() {
		System.out.println("*********StudentDetails***");
		System.out.println("StudentName"+Name);
		System.out.println("StudentBranch"+Branch);
		System.out.println("StudentRollNo"+RollNo);
		
		ad.getAddress();
		cd.getContact();
	}
		
	
	

}
