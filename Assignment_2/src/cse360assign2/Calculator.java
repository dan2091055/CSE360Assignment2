package cse360assign2;

/**
 * 
 * 
 * 
 * 
 * @author Daniel Martinez
 * Class ID: 475
 * Project description: below are some of the commands that we need to code
 * 
 * @author Daniel Martinez
 *
 */

public class Calculator {
	
	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 * this is going to be returning the total value that has been calculated.
	 * @return
	 */
	
	public int getTotal () {
		return 0;
	}
	
	/**
	 * this is going to be adding the total and the value together.
	 * 
	 * 
	 * @param value
	 */
	
	public void add (int value) {
		
		total = total += value;//this is adding the two values.
		
	}
	/**
	 * The function below is going to be subtracting the value from the total.
	 * 
	 * @param value
	 */
	
	public void subtract (int value) {
		
		total = total -= value;//this is subtracting the two values.
		
	}
	/**
	 * The multiply function is going to multiply the total with the value parameter
	 * 
	 * 
	 * @param value
	 */
	
	public void multiply (int value) {
		total = total*value;// this is multiplying the values
	}
	/**
	 * The divide function is going divide the total by the paramater value,
	 * but if the value is equal to zero then we set the total equal to zero
	 * 
	 * @param value
	 */
	
	public void divide (int value) {
		/**
		 * this if statement here is going to checking to see if the the parameter is 
		 * equal to zero
		 * 
		 * 
		 * 
		 */
		if(value == 0) {
			total = 0;
		}else {
			total = total/value;//this is going to be dividing the total by the paramater.
		}
		
	}
	
	public String getHistory () {
		return "";
	}

}
