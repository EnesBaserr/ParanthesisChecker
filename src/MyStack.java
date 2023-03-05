
package question;
import java.util.Arrays;
import java.util.NoSuchElementException;

import javax.swing.text.ChangedCharSetException;


public class MyStack{
	
	private Character[] a; // array of items
	
	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	public MyStack() {
		a= new Character[4];
	}
	public boolean isEmpty() {
		boolean flag = true;
		for(int i = 0 ; i<a.length;i++) {
			if(a[i]==null) {
				continue;
			}
			else {
				flag=false;
				break;
			}
		}
		return flag;
	}
	public int size() {
		int counter = 0;
		for(int j = 0 ; j<a.length;j++) {
			if(a[j]!= null) {
				counter++;
			}
			else {
				break;
			}
			
		}
		return counter;
		
	}
	private void resize() {
		int newsize=a.length*2;
		Character[] newArray = new Character[newsize];
		for(int k = 0 ; k<size();k++) {
			newArray[k]=a[k];
		}
		a=newArray;
		
		
		
	}
	public void push(char c) {
		if(size()==a.length) {
			resize();
		}
		a[size()]=c;
	}
	public Character pop() {
		Character x= a[size()-1];
		Character[] newArray = new Character[a.length];
		for(int j = 0 ; j<size()-1;j++) {
			newArray[j]=a[j];
			
		}
		a=newArray;
		return x;
		
		
		
		
	}
	public Character peek() {
		return a[size()-1];
		
	}
	


	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
	
}

