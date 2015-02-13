import java.util.ArrayList;
public class School {
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Teacher> teachers = new ArrayList<Teacher>();

	public School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
		this.students = students;
		this.teachers = teachers;
	}
}
