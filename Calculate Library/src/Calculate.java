
//Leonard Wang 8/30/16
public class Calculate {
	public static int square(int numToBeSquared){
		return numToBeSquared*numToBeSquared;
	}
	public static int cube(int numToBeCubed){
		return numToBeCubed*numToBeCubed*numToBeCubed;
	}
	public static double average(double num1, double num2){
		return (num1*num2)/2;
	}
	public static double average(double num1, double num2, double num3){
		return (num1*num2*num3)/3;
	}
	public static double toDegrees(double radians){
		return (180*radians)/3.14159;
	}
	public static double toRadians(double degrees){
		return 3.14159*degrees/(180);
	}
	public static double discriminant(double a, double b, double c){
		return((b*b)-(4*a*c));
	}
	public static String toImproperFrac(int a, int b, int c){
		int d = (a*c) + b;
		return (d + "/" + c);
	}
	public static String toMixedNUm(int a, int b){
		int c = a/b;
		int d = a%b;
		return(c + "_" + d + "/" + b);
	}
	public static String foil( int a, int b, int c, int d, String e){
		return((a*c) + e +"^2  + " + ((b*c)+(d*a)) + e + " + " +  d*b);
	}
	public static boolean isDivisibleBy(int a, int b){
		if(b < 0){
			throw new IllegalArgumentException("Input is negative");
		}
		if(a%b ==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static double absValue(double a){
		if(a < 0){
			return a*-1;
		}
		else{
			return a;
		}
	}
	public static int max(int a, int b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
	public static double max(double a, double b, double c){
		if(a>b && a>c){
			
			return a;
		}
		else if(b>a && b>c){
			return b;
		}
		else{
			return c;
		}
	}
	public static double min(double a, double b){
		if(a<b){
			return a;
		}
		else{
			return b;
		}
	}
	public static double round2 (double a){
		int answer = ((int)(a * 100));
		 if ((a * 100)-answer >= .5){
			 double roundup = ((int)(a*100)+1)/100.00;
			 return roundup;		
		 }
		 
		 else {
			 double rounddown = (int)(a*100)/(100.00);
			 return rounddown;
		 }
	}
	public static double exponent(double a, double b){
		if(b < 0){
			throw new IllegalArgumentException("Input is negative");
		}
		double answer = 1.0;
		for(int i = 0; i < b; i++){
			answer *= a;
		}
		return answer;
	}
	public static int factorial(int a){
		int answer = 1;
		if(a < 0){
			throw new IllegalArgumentException("Input is negative");
		}
		for(int i = 1; i <= a; i++){
			answer *= i;
		}
		return answer;
	}
	public static boolean isPrime(int a){
		boolean s = true;
		for(int i = 1; i < a; i++){
			if(s = Calculate.isDivisibleBy(a, i)){
				s =  false;
			}else{
				s = true;
			}
		}
		return s;
	}
	public static int gcf(int a, int b){
		boolean d = true;
		if(d = Calculate.isDivisibleBy(a, b)){
			return b;
		}
		if(b == 0){
			return b;
		}else{
			return gcf(b, a%b);
			}
	}
	public static double sqrt(double a){
		if(a < 0){
			throw new IllegalArgumentException("Input is negative");
		}
		double t;
		 
		double squareRoot = a / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (a / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	public static String quadForm(int a, int b, int c){
		double x = (double)(a);
		double y = (double)(b);
		double z = (double)(c);
		double e = 0;
		double f = 0;
		String d = "";
		String u = "";
		if(Calculate.discriminant(a, b, c) < 0){
			d = "no real roots";
			return d;
		} else if(Calculate.discriminant(a, b, c) == 0){
			e = -b/2*a;
			d = String.valueOf(e);
			return d;
		} else{
			e = (-b - (Calculate.sqrt(Calculate.discriminant(x, y, z))))/(2*a);
			f = (-b + (Calculate.sqrt(Calculate.discriminant(x, y, z))))/(2*a);
			if(e>f){
				d = String.valueOf(e);
				u = String.valueOf(f);
				return f + " and " + e;
			} else{
				return e + " and " + f;
			}
		}
	}

	
}

