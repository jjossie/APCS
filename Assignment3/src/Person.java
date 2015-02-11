
public class Person {
	private String fname;
	private String lname;
	public Person(String f, String l){
		fname = f;
		lname = l;
	}
	public Person(){
		this("","");
	}
	public String toString(){
		return "" + lname + ", " + fname;
	}
}
