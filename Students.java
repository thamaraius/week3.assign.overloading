package Overloading;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Student id number is "+id);
	}

   public void getStudentInfo(int id,String name) {
		
		System.out.println("Student id number is "+id);
		System.out.println("Student name is"+name);
	}
   public void getStudentInfo(String emailId,long phoneNumber) {
	
	System.out.println("Student contact details are "+emailId);
	System.out.println("Student contact details are "+phoneNumber);
}

	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(788);
		obj.getStudentInfo(222, "Thamarai");
		obj.getStudentInfo("thamarai.selvaraku@gmail.com",9999999999L);
		System.out.println("******Overloading*********");
		

	}

}
