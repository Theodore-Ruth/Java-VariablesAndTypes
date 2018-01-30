//Theodore Ruth Java - Variables and Types: Exercise3_ReassigningValuesToVariables
//I'm pretty sure I already did what this exercise was asking for in the 
//previous exercise and then some. I just thought it looked better.

public class Exercise3_ReassigningValuesToVariables {

	public static void main(String[] args) {
		double x = 4.0;
		System.out.println("x = " + x);
		System.out.print("3(" + x + ")^2 - 8(" + x + ") + 4 = ");
		System.out.println(myFormula(x));
		System.out.println("");
		
		x = 5.0;
		System.out.println("x = " + x);
		System.out.print("3(" + x + ")^2 - 8(" + x + ") + 4 = ");
		System.out.println(myFormula(x));
		System.out.println("");
		
		x = 0.0;
		System.out.println("x = " + x);
		System.out.print("3(" + x + ")^2 - 8(" + x + ") + 4 = ");
		System.out.println(myFormula(x));
		System.out.println("");
		
		x = 2.0;
		System.out.println("x = " + x);
		System.out.print("3(" + x + ")^2 - 8(" + x + ") + 4 = ");
		System.out.println(myFormula(x));
		System.out.println("");
		
		x = 2 / 3;
		System.out.println("x = " + x);
		System.out.print("3(" + x + ")^2 - 8(" + x + ") + 4 = ");
		System.out.println(myFormula(x));
		System.out.println("");
		
		x = 2.0 / 3.0;
		System.out.println("x = " + x);
		System.out.print("3(" + x + ")^2 - 8(" + x + ") + 4 = ");
		System.out.println(myFormula(x));
		System.out.println("");
		

	}
	
	//I just made the recurring formula into a method where I input x.
	
	public static double myFormula(double x)
	{
		return (3 * Math.pow(x, 2)) - (8 * x) + 4;
	}

}


