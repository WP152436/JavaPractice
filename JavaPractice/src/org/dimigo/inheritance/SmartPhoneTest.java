/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *	|_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 *
 * @author 		:playblock
 * @version 	: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] sp = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(int i =0; i<sp.length; i++){
			System.out.println(sp[i].toString());
			sp[i].turnOn();
			if(sp[i] instanceof IPhone){
				sp[i].pay();
				sp[i].useSpecialFunction(sp[i]);
			}
			else if(sp[i] instanceof Galaxy){
				sp[i].pay();
				sp[i].useSpecialFunction(sp[i]);
			}
			sp[i].turnOff();
			System.out.println();
		}
		
		
	}

}
