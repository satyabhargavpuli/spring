package basicSetterInjection;

public class Exam {
	public void dta(Student student) {
		student.name="satya";
		student.num=10;
		System.out.println(student.name+""+student.num);

		
		//return student.name+""+student.num;
	}

	
	
	public static void main(String[] args) {
		
		//System.out.println(Exam.dta);
	
		/*Student student = new Student();
	             student.setStudentName("bhargav");
	             student.displayEmpData();*/
	}
}
