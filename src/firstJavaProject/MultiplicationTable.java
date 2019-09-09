package firstJavaProject;

public class MultiplicationTable {
	// multiplication table for 5
	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d*%d=%d", 5, i, 5 * i).println();
			// System.out.println(""%d*%d=%d",5,i,5*1);
		}

	}

	/*
	 * THIS TWO CODES HAVE LOT OF DUPLICATE VALUES SO WE ARE GOING TO REMOVE THEM
	 * BELOW THESE TWO CODE IS WORKING CODE FIRST WE DID THIS WITH THE INSTRUCTOR,
	 * THEN THE ONES NOT COMMENTED BELOW THIS WAS ADDED TO CONDENSE THE CODE
	 */

	/*
	 * void print(int table) { for (int i = 1; i <= 10; i++) {
	 * 
	 * 
	 * System.out.printf("%d*%d=%d", table, i, table * i).println(); //
	 * System.out.println(""%d*%d=%d",5,i,5*1); " } }
	 * 
	 * void print(int table, int from, int to) { for (int i = from; i <= to; i++) {
	 * 
	 * System.out.printf("%d*%d=%d", table, i, table * 1).println(); //
	 * System.out.println(""%d*%d=%d",5,i,5*1); }
	 * 
	 * } }
	 */

	// THIS IS THE new code TO REMOVE DUPLICATE COADING
	void print(int table) { 
		print(table, 1, 10);

	}

	void print(int table, int from, int to) {
		for (int i = from; i <= to; i++) {

			System.out.printf("%d*%d=%d", table, i, table * i).println();
			// System.out.println(""%d*%d=%d",5,i,5*1);
		}

	}
}
