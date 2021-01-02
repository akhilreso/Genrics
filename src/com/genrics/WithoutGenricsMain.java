/**
 * 
 */
package com.genrics;

/**
 * @author akhil
 * Date: 02/01/2021
 * We see without Genrics we have to creat many object on the behalf of its nature ;
 */
public class WithoutGenricsMain {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		WithoutGenrics object = new WithoutGenrics(98);
        object.print();
        WithoutGenrics2 object2 = new WithoutGenrics2("Human can do any thing");
        object2.print2();
	}

}
