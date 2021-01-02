/**
 * 
 */
package com.genrics;

/**
 * @author akhil
 *
 */
public class GenericsBound<T extends Number> {
	
	T objB;
	public GenericsBound(T objb){
		this.objB=objb;
		
	}
	
	public double square(){
		/*
		 * We can not aply multiplication other than numaric value in java 
		 * For solving this froblem we have to bound the nature of object to numaric
		 * */
		double objt = objB.byteValue()*objB.doubleValue();
		
		return objt;
		
		
	}

}
