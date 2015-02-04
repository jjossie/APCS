import java.util.ArrayList;

public class Strand
{
	// An ArrayList that stores a strand of lights
	private ArrayList<Light> strand = new ArrayList<Light>();

	public Strand()
	{
		strand.add(new Light());
	}

	public Strand(int n)
	{
		for (int i = 0; i <n; i++){
			strand.add(i, new Light());
		}
	}

	public String toString() {
		String s = "";
		for (Light l : strand) {
			s = s + l.toString() + '\n';
		}
		return s;
	}

	// This method sets the color of all the light bulbs in the entire Strand.
	public void setColor(String c)
	{
		if (c.equals("blue") || c.equals("red") || c.equals("green") || c.equals("white")) {
			for (Light l : strand) {
				l.setColor(c);
			}
		}
	}


	public void setMulti()
	{
		for (int i = 1; i<=strand.size(); i++){
			int remainder = i%3;
			switch (remainder){
				case 1:
					strand.get(i-1).setColor("red");
					break;
				case 2:
					strand.get(i-1).setColor("green");
					break;
				case 0:
					strand.get(i-1).setColor("blue");
					break;

			}
		}
	}

	public void turnOn()
	{
		for (Light l: strand){
			if (!l.burntOut)
				if (!l.isOn())
					l.flip();
		}
	}

	public void turnOff()
	{
		for (Light l: strand){
			if (l.isOn())
				l.flip();
		}
	}

	public void burnOut(int i)
	{
		strand.get(i).burnOut();
	}

	public static void main(String[] args)
	{
		// *************************************************************************
		// 1. Test Strand()
		// *************************************************************************
		System.out.println("1. Test the default constructor Strand()");
		Strand strand1 = new Strand();
		if (strand1.strand.size() == 1)
			System.out.println("*** PASS: Strand() creates a list of size 1");
		else
			System.out.println("*** FAIL: Strand() creates a list of size "
					+ strand1.strand.size()
					+ ", when a list of size 1 is expected.");

		// ***********************************
		// 2. Test Strand(n)
		// ***********************************
		System.out.println("\n2. Test the constructor Strand(n)");
		// Try to create a strand of lights with 0 bulbs
		Strand emptyStrand = new Strand(0);
		if (emptyStrand.strand.size() == 1)
			System.out.println("*** PASS: Strand(0) creates a list of size 1");
		else
			System.out.println("*** FAIL: Strand(0)  creates a list of size "
					+ emptyStrand.strand.size()
					+ ", when a list of size 1 is expected.");
		// Try to create a strand of lights with a negative number
		Strand negativeStrand = new Strand(-7);
		if (negativeStrand.strand.size() == 1)
			System.out.println("*** PASS: Strand(-7) creates a list of size 1");
		else
			System.out.println("*** FAIL: Strand(-7) creates a list of size "
					+ negativeStrand.strand.size()
					+ ", when a list of size 1 is expected.");
		// Try to create a strand of lights with a positive number
		Strand strandWithFiveBulbs = new Strand(5);
		if (strandWithFiveBulbs.strand.size() == 5)
			System.out.println("*** PASS: Strand(5) creates a list of size 5");
		else
			System.out.println("*** FAIL: Strand(5) creates a list of size "
					+ strandWithFiveBulbs.strand.size()
					+ ", when a list of size 5 is expected.");
		// Verify that all the light bulbs are initialized properly
		boolean success = true;
		for (Light bulb : strandWithFiveBulbs.strand)
		{
			if (!(bulb.isOn() && bulb.getColor().equals("white")))
			{
				success = false;
			}
		}
		if (strandWithFiveBulbs.strand.size() > 0 && success)
		{
			System.out.println("*** PASS: Strand(5) initialized bulbs correctly");
		}
		else
		{
			System.out.println("*** FAIL: Strand(5) did not initialize bulb(s) correctly");
		}


		// ***********************************
		// 3. Test setColor(String)
		// ***********************************
		System.out.println("\n3. Test setColor(String)");
		// All of the bulbs in our strandWithFiveBulbs are white. Set them to
		// green.
		strandWithFiveBulbs.setColor("green");
		success = true;
		for (Light light : strandWithFiveBulbs.strand)
		{
			if (!light.getColor().equals("green"))
				success = false;
		}
		if (strandWithFiveBulbs.strand.size() > 0 && success)
			System.out.println("*** PASS: setColor worked as expected (green test)");
		else
			System.out.println("*** FAIL: setColor did not work as expected (green test)");
		// Now try to set them to a color that is not supported.  This should 
		// cause all the bulbs to be set back to white.
		strandWithFiveBulbs.setColor("pink");
		success = true;
		for (Light light : strandWithFiveBulbs.strand)
		{
			if (!light.getColor().equals("white"))
				success = false;
		}
		if (strandWithFiveBulbs.strand.size() > 0 && success)
			System.out.println("*** PASS: setColor worked as expected (pink test)");
		else
			System.out.println("*** FAIL: setColor did not work as expected (pink test)");


		// ***********************************
		// 4. Test turnOff()
		// ***********************************
		System.out.println("\n4. Test turnOff()");
		strand1.turnOff();
		if (strand1.strand.size() > 0 && !strand1.strand.get(0).isOn())
		{
			System.out.println("*** PASS: turnOff() worked as expected");
		}
		else
		{
			System.out.println("*** FAIL: turnOff() did not work as expected");
		}

		// ***********************************
		// 5. Test turnOn()
		// ***********************************
		System.out.println("\n5. Test turnOn()");
		strand1.turnOn();
		if (strand1.strand.size() > 0 && strand1.strand.get(0).isOn())
		{
			System.out.println("*** PASS: turnOn() worked as expected");
		}
		else
		{
			System.out.println("*** FAIL: turnOn() did not work as expected");
		}

		// ***********************************
		// 6. Test burnOut(int)
		// ***********************************
		System.out.println("\n6. Test burnOut(n)");
		strand1.burnOut(0);
		if (strand1.toString().equals("off white\tburnt out\n"))
		{
			System.out.println("*** PASS: burnOut(1) works as expected.");
		}
		else
		{
			System.out.println("*** FAIL: burnOut(1) does not work as expected.");
		}
	}
}
