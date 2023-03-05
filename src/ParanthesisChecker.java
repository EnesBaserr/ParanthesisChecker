
package question;

import junit.extensions.TestSetup;

public class ParanthesisChecker {
	

	public boolean isCorrect(String javaCode) { 
		
		//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
		MyStack stack = new MyStack();
		boolean flag=true;
		int counter = 0;
		

		for(int i = 0 ; i<javaCode.length();i++) {

			
			
			if(javaCode.charAt(i)=='"') {
				counter++;
				
				
				
					
				}
			if(counter%2!=0) {
				
				
				continue;
			}
			
			
			
			if(javaCode.charAt(i)=='(' || javaCode.charAt(i)=='{') {

				stack.push(javaCode.charAt(i));
				
				
			}
			else if(javaCode.charAt(i)==')') {
				if(stack.isEmpty()) {
					flag=false;
					break;
				}
				Character checker = stack.pop();
				if(checker== '{') {
					flag=false;
					break;
				}
				else {
					flag=true;
				}
				
			
			}
			else if(javaCode.charAt(i)=='}') {
				if(stack.isEmpty()) {
					flag=false;
					break;
				}
				Character checker = stack.pop();
				if(checker== '(') {
					flag=false;
					break;
				}
				else {
					flag=true;
				}
				
			}
			if(i==javaCode.length()-1) {
				if (stack.isEmpty()) {
					
					flag=true;
					break;
				}
				else {
					flag=false;
					break;
				}
				
			}
			
		}
		return flag;


		//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
		
	}
	
}


