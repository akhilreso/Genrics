/**
 * 
 */
package com.genrics;

/**
 * @author akhil
 * Date: 02/01/2021
 * Here we want a object who have only string
 */
public class WithoutGenrics2 {
	
	String s;
	
	public WithoutGenrics2(String p){
		 
		   this.s=p;
	}

	public void print2() {
		System.out.println(s);
	}
}
