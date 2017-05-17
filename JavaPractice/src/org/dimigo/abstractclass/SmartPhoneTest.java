/**
 * 
 */
package org.dimigo.abstractclass;

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
		
		for(SmartPhone p : sp){
			System.out.println(p.toString());
			p.turnOn();
			
			if(p instanceof IPhone){
				p.pay();
				p.useSpecialFunction();
			}
			
			else if(p instanceof Galaxy){
				p.pay();
				p.useSpecialFunction();
			}
			p.turnOff();
			System.out.println();
		}
		
		
	}

}
