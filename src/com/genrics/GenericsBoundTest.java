/**
 * 
 */
package com.genrics;

/**
 * @author akhil
 * Date : 02/01/2021
 */
public class GenericsBoundTest {

	/**
	 * @param args
	 * When we try to pass other than Numaric its give compile time error 
	 * "Bound mismatch: The type String is not a valid substitute for 
	 * the bounded parameter 
	 * <T extends Number> of the type GenericsBound<T>"
	 */
	public static void main(String[] args) {
		GenericsBound<Double> gbo = new GenericsBound<>(67.0);
        System.out.println(gbo.square());
	}

}
