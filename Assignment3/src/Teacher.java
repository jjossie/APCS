public class Teacher extends Person {
	private String subject;
	public Teacher(String f, String l, String subject) {
		super(f, l);
		this.subject = subject;
	}

	public String toString() {
		String str;
		str = super.toString() + "\n   Subject: " + subject;
		return str;
	}
}
