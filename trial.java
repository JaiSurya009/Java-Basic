// Java Program to illustrate methods

import java.io.*;

class trial {

	int sum = 0;

	public int addTwoInt(int a, int b)
	{

		sum = a + b;
		return sum;
	}
}

class GFG {
	public static void main(String[] args)
	{

		// Creating an instance of Addition class
		trial add = new trial();
		int s = add.addTwoInt(1, 2);

		System.out.println("Sum of two "
						+ "integer values: "
						+ s);
	}
}
