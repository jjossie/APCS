
public class Person {
	String fname;
	String lname;
	public Person(String f, String l){
		fname = f;
		lname = l;
	}

	public String toString(){
		return "" + lname + ", " + fname;
	}
}
