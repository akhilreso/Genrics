/**
 * 
 */
package com.genrics;

/**
 * @author akhil
 * Date:02/01/2021
 * Can't use primitive type data 
 * We can pass arugument
 */
public class GenricsItroTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GenricsIntro1<String> obj2 = new GenricsIntro1<>("Akhil");
		//Now GenricsIntro1 object is type safe during compile time java 5
		GenricsIntro1<Integer> obj5 = new GenricsIntro1<>(10);
		GenricsIntro1<Double> obj3 = new GenricsIntro1<>(10.02);
		GenricsIntro1<Boolean> obj4 = new GenricsIntro1<>(true);
		obj2.printG();
		obj3.printG();
		obj5.printG();
		obj4.printG();
		
		
	}

}
