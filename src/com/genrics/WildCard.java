/**
 * 
 */
package com.genrics;

/**
 * @author akhil
 * Date: 02/01/2021
 */
public class WildCard<T extends Number> {
	
	T obj;
	
	public WildCard(T objk) {
		this.obj=objk;
	}
	
	public boolean squar(WildCard<?> objk) {
		
		if(Math.abs(obj.doubleValue()==Math.abs(obj.doubleValue()))) {
			return true;
			
		}
		
		return false;
		
		 
		
	}
	

}
