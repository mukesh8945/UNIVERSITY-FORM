package p2;
import java.util.Scanner;
import p1.*;
public class DemoRef2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student ob = new  Student();
		System.out.println("Enter the StuName:");
		ob.Name = s.nextLine();
		System.out.println("Enter the StuRollNo");
		ob.RollNo = s.nextLine();
		System.out.println("Enter the StuBranch");
		ob.Branch = s.nextLine();
		 System.out.println("Enter the StuHNo:");
	       ob.ad.hNo = s.nextLine();
	       System.out.println("Enter the StuCity:");
	       ob.ad.city = s.nextLine();
	       System.out.println("Enter the StuState:");
	       ob.ad.state = s.nextLine();
	       System.out.println("Enter the Department");
	       ob.ad.Department = s.nextLine();
	       System.out.println("Enter the Enrollment");
	       ob.ad.Enrollment = s.nextLine();
	       System.out.println("Enter the Gender");
	       ob.ad.Gender = s.nextLine();
	       System.out.println("Enter the StuPinCode:");
	       ob.ad.Pincode = Integer.parseInt(s.nextLine());
	       System.out.println("Enter the StuMailId:");
	       ob.cd.mailId = s.nextLine();
	       System.out.println("Enter the StuPhoneNo:");
	       ob.cd.PhNo = s.nextLong();
	       ob.getStudent();
	       s.close();

	}

}
