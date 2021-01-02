/**
 * 
 */
package com.genrics;

import java.util.HashMap;

/**
 * @author akhil
 * @see Genrics provide codereusabilty 
 *
 */
public class MultiArgumentGenricas<T ,K> {
	T obj;
	K obj2;
	

	public MultiArgumentGenricas(T obj ,K obj2){
		this.obj=obj;
		this.obj2=obj2;
		}
	//creating a method who gives class type of object (nature)
	
	HashMap<T, K> obje =new HashMap<>();
	
	
	public  void printType() {
		
		System.out.println(obje);
		
		System.out.println(obj.getClass().getName() +obj2.getClass().getName());
		
	}
}
