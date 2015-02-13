import java.util.ArrayList;
public class School {
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Teacher> teachers = new ArrayList<Teacher>();

	public String getGradeLevel(int g){
		String str = "";
		for (Student s: students){
			if (s.getLevel() == g){
				str = str + s.toString() + "\n";
			}
		}
		return str;
	}

	public School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
		this.students = students;
		this.teachers = teachers;

	}
	public String toString(){
		String str = "";
		str = "Faculty: \n";
		for (Teacher t: teachers){
			str = str + t.toString() + '\n';
		}
		str = str + "\nStudent Body:\n";
		for (Student s: students){
			str = str + s.toString() + '\n';
		}
		return str;
	}
}
