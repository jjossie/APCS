public class HighSchoolStudent extends Student {
	private double gpa;
	public HighSchoolStudent(String f, String l, int g, double gpa){
		super(f, l, g);
		if (gpa<=5 && gpa>=0)
			this.gpa = gpa;
		else
			this.gpa = 0;
	}
}
