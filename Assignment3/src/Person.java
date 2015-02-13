public class Person {
	private String fname;
	private String lname;
	public Person(String f, String l) {
		fname = f;
		lname = l;
	}
	public String toString(){
		return "" + lname + ", " + fname;
	}
}
