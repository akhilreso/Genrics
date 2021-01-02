/**
 * 
 */
package com.genrics;

/**
 * @author akhil
 * Date 02/01/2021
 * Let's asume we want a object who have integer only 
 * Basicly we creating dumplicate code the only one thing change is object type 
 * or nature ob object.
 */
public class WithoutGenrics {
	Integer i;
	
	public WithoutGenrics(Integer j) {
		this.i=j;
	}
	
	public void print() {
		System.out.println(i);
	}
	
	

}
