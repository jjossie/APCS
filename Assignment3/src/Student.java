
public class Student extends Person{
	private int grade;
	private int id;
	private static int currentID = 0;
	public Student(String f, String l, int g){
		super(f, l);
		grade = g;
		id = currentID;
		currentID++;
	}
	public int getLevel(){
		return grade;
	}
	public String toString(){
		String str;
		str = lname + ", " + fname + "\n   Grade Level: " + grade + "\n   ID #: " + id;
		return str;
	}

}
