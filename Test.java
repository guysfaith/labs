public class Test {
	public static boolean testAddInt (Calc c){
		if (c.add(1,2)==3)
			return true;
		else return false;
	}

	public static boolean testAddDb (Calc c){
		if (c.add(1.5,2.5)==4)
			return true;
		else return false;
	}

	public static boolean testSubInt (Calc c){
		if (c.sub(16,2)==14)
			return true;
		else return false;
	}

	public static boolean testSubDb (Calc c){
		if (c.sub(16.8, 12.1)==4.7)
			return true;
		else return false;
	}

	public static boolean testMulInt (Calc c){
		if (c.mul(1,2)==2)
			return true;
		else return false;
	}

	public static boolean testMulDb (Calc c){
		if (c.mul(1.5,12.0) == 18.0)
			return true;
		else return false;
	}

	public static boolean testDivInt (Calc c){
		if (c.div(16,2) == 8)
			return true;
		else return false;
	}

	public static boolean testDivDb (Calc c){
		if (c.div(18.3,3.0) == 6.1)
			return true;
		else return false;
	}

	public static boolean intMax (Calc c){
			int a = c.add(2147483647,1);
			if (a > 2147483647)
				return false;
			else return true;
	}

	public static boolean intMid (Calc c){
		if (c.add(0,0) == 0)
			return true;
		else return false;
	}

	public static boolean intMin (Calc c){
			int a = c.add(-2147483648, -1);
			if (a < -2147483648)
				return false;
			else return true;	
	}

	public static void testRes (Calc c){
				if(testAddInt(c))
					System.out.println("Integers addition test passed.");
				else System.out.println("Integers addition test failed.");
				if(testSubInt(c))
					System.out.println("Integers subtraction test passed.");
				else System.out.println("Integers subtraction test failed.");
				if(testMulInt(c))
					System.out.println("Integers multiplication test passed.");
				else System.out.println("Integers multiplication test failed.");
				if (testDivInt(c))
					System.out.println("Integers division test passed.");
				else System.out.println("Integers division test failed.");
				if(testAddDb(c))
					System.out.println("Doubles addition test passed.");
				else System.out.println("Doubles addition test failed.");
				if(testSubDb(c))
					System.out.println("Doubles subtraction test passed.");
				else System.out.println("Doubles subtraction test failed.");
				if(testMulDb(c))
					System.out.println("Doubles multiplication test passed.");
				else System.out.println("Doubles multiplication test failed.");
				if (testDivDb(c))
					System.out.println("Doubles division test passed.");
				else System.out.println("Doubles division test failed.");
				if (intMin(c))
					System.out.println("Integers triangulation minimum test passed.");
				else System.out.println("Integers triangulation minimum test failed.");
				if (intMid(c))
					System.out.println("Integers triangulation middle test passed.");
				else System.out.println("Integers triangulation middle test failed.");
				if (intMax(c))
					System.out.println("Integers triangulation maximum test passed.");
				else System.out.println("Integers triangulation maximum test failed.");
	}
	public static void main (String args[]){
		Calc c = new Calc();
		testRes(c);
	}
	
}


