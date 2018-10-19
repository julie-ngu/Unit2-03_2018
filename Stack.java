/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Stack file for MrCoxallStack program
 *
 ****************************************************************************/

import java.util.ArrayList;
import java.util.Collections;

public class Stack {
	private static final ArrayList<Integer> stackArray = new ArrayList<Integer>();
	
	public void print() {
		//prints entire stack
		System.out.print(stackArray);
	}
	
	public void push(int value) {
		//adds value to stack
		stackArray.add(value);
		print();
	}
	
	public void pop() {
		//removes top value from stack
		if(stackArray.size() < 0 || stackArray.size() == 0 ) {
			System.out.print("\nStack is empty.");
		}
		else {
			int top = stackArray.size()-1;
			stackArray.remove(top);
			print();
		}
	}
	
	public void clear() {
		//clears values in stack
		if(stackArray.size() < 0 || stackArray.size() == 0 ) {
			System.out.print("\nStack is empty.");
		}
		else {
			stackArray.clear();
			System.out.print("\nStack is cleared.");
		}
	}
}
