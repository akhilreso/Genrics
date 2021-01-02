/**
 * 
 */
package com.genrics;

/**
 * @author akhil
 * Date: 02/01/2021
 * I creat a genrc  type of object;
 * I creat one class /object who takes diffrent type of variable by the help of Genrics
 * Genrics also provoid Type sefty at compile time Type sefty.
 * When we don't know what type of variavle user gonna pass ate copmile time we use genrics
 */
public class GenricsIntro1<T> {
 
	T obj;
	public GenricsIntro1(T objc) {
		this.obj=objc;
	}
	//This Method prints the Type of objcet
	public void printG() {
		System.out.println(obj.getClass().getName());
	}
}
