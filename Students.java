package week3.day1;

public class Students {
	public int getStudentInfo(int id) {
		System.out.println("Student id id"+id);
		return id;

	}
	public int getStudentInfo(int id,String str) {
		System.out.println("The student id is" + id);
		System.out.println("The student name is" + str);
		return id;
	}
	public long getStudentInfo(String mail,long number) {
		System.out.println("The student mail id is:"+mail);
		System.out.println("The student mobile no is"+ number);
		return number;
	}



	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(19000);
		obj.getStudentInfo(19000, "Jennifer");
		obj.getStudentInfo("JenniferAnniston@gmail.com", 987654321); 
		

	}

}
