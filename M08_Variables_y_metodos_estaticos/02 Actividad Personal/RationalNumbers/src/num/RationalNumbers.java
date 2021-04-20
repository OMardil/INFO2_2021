package num;

public class RationalNumbers {

	private int numerator;	
	private int denominator;
	
	public static void main(String[] args) {
		
		
		assertTest(1,2,1);
		assertTest(5,5,5);
		assertTest(3,13,1);
		assertTest(26,6,2);
		assertTest(10,5,5);
		assertTest(100,100,100);	
		
		assertTest(-1,2,1);
		assertTest(5,-5,5);
		assertTest(-3,-13,1);		
		
		
		//RationalNumbers r1 = new RationalNumbers(100,20);
		//System.out.println(r1);
		
	}
	
	private static void assertTest(int num, int denom, int resp) {
		int gcd = getGCD(num,denom);
		if (gcd == resp) {
			System.out.println("Correct!");
		} else {
			System.out.println("Incorrect!");			
		}
		
	}

	//A default constructor that sets the rational number to 0/1.
	public RationalNumbers() {
		this.numerator = 0;
		this.denominator = 1;
	}

	public RationalNumbers(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	//simplify() – a private method that converts the rational number to simplified form.	
	private void simplify() {
		int gcd = RationalNumbers.getGCD(this.numerator, this.denominator);
		this.numerator = this.numerator / gcd;
		this.denominator = this.denominator / gcd;
	}
	
	//getGCD(x,y) – a private static method that returns the largest common 
	// factor of the two positive integers x and y, that is, their greatest 
	//common divisor. For example, the greatest common divisor of 40 and 12 is 4.	
	private static int getGCD(int numerator, int denominator) {
		int gcd = 1;
		int gcdTest = 1;
		
		numerator = (numerator<0)?numerator*-1:numerator;
		denominator = (denominator<0)?denominator*-1:denominator;
		
		while(numerator>=gcdTest && denominator>=gcdTest) {
			if(numerator%gcdTest == 0 && denominator%gcdTest == 0) {
				gcd = gcdTest;
			}
			gcdTest++;
		}
		
		return gcd;
	}
	
	//getValue() – returns the rational number as a double value.
	public double getValue() {
		return (double)this.numerator/this.denominator;
	}
	
	//toString() – returns the rational number as a string in the form a/b.
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

}
