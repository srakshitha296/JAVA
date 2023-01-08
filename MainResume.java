package InterfaceDemo;

class Teacher implements Resume {
	
	String staffID;
	String name;
	String designation;
	long phNo;
	String qualification;
	double experience;
	 
	Teacher(String id, String n, String d, long p, String q, double e) {
		this.staffID = id;
		this.name =  n;
		this.designation = d;
		this.phNo = p;
		this.qualification = q;
		this.experience = e;
		
	}

	@Override
	public void biodata() {
		System.out.println("Staff ID : " +staffID);
		System.out.println("Staff Name : " +name);
		System.out.println("Designation : " +designation);
		System.out.println("Phone Number : " +phNo);
		System.out.println("Qualification : " +qualification);
		System.out.println("Experience : " +experience);
	}
	
}
class Student implements Resume {
	String usn;
	String name;
	String discipline;
	long phNo;
    float result;
    
    Student(String u, String n, String d, long p, float r) {
		this.usn = u;
		this.name =  n;
		this.discipline = d;
		this.phNo = p;
		this.result = r;
    }
	

	@Override
	public void biodata() {
		System.out.println(" Student USN : " +usn);
		System.out.println("Student Name : " +name);
		System.out.println("Discipline : " +discipline);
		System.out.println("Phone Number : " +phNo);
		System.out.println("Result : " +result);		
	}

	
	
}

public class MainResume {
	 

	public static void main(String[] args) {
		Teacher t = new Teacher("001", "IRIN", "Professor", 728456956, "Mtech", 15.5);
		t.biodata();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Student s = new Student("CS048", "RAKSHIKA", "IT", 925471862,10 );
		s.biodata();

	}

}
