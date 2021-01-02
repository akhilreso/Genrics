/**
 * 
 */
package com.genrics;

/**
 * @author akhil
 * 
 * Date 02/01/2021
 */
public class MultiArgumentGenricasTest {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		MultiArgumentGenricas<String ,Integer> obj=new MultiArgumentGenricas<>("Java" ,5);
				obj.printType();
	}

}
