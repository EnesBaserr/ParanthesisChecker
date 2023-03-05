
package question;

public class Main
{
	// Main method is for you to test your code
	// You will not get any points here
	public static void main(String[] args) {
		
		
		// Example:
		// Code that displays Fibonacci Series:
		String javaCode1 = "class Main {\r\n"
				+ "  public static void main(String[] args) {\r\n"
				+ "\r\n"
				+ "    int n = 10, firstTerm = 0, secondTerm = 1;\r\n"
				+ "    System.out.println(\"Fibonacci Series till \" + n + \" terms:\");\r\n"
				+ "\r\n"
				+ "    for (int i = 1; i <= n; ++i) {\r\n"
				+ "      System.out.print(firstTerm + \", \");\r\n"
				+ "\r\n"
				+ "      // compute the next term\r\n"
				+ "      int nextTerm = firstTerm + secondTerm;\r\n"
				+ "      firstTerm = secondTerm;\r\n"
				+ "      secondTerm = nextTerm;\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}";
		String tst3 = "System.outprint(\"Enter a number (((even or odd): \");\r\n"
				+ "int num = reader.nextInt();\r\n"
				+ "\r\n"
				+ "if(num % 2 == 0)\r\n"
				+ "    System.out.println(num + \" {is even\");\r\n"
				+ "else\r\n"
				+ "    System.out.println(num + \" {is odd\");\r\n";
		String tst1 = 
				"""			
				private static void waitForNextFrame() {
			do {
			{
				deltaTime += System.currentTimeMillis() - previousTime;
				previousTime = System.currentTimeMillis();
				StdDraw.pause(1);
			} while (deltaTime <= MS_PER_FRAME);

			deltaTime -= MS_PER_FRAME;
				}
			
						"""; //false
		
		String tst2 = 
				"\"sevgi\"{}\"()";
		
		
		ParanthesisChecker checker = new ParanthesisChecker();
		System.out.println(checker.isCorrect(tst2));
		
	}

}

