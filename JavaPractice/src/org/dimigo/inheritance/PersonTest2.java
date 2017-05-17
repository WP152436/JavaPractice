/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *	|_ PersonTest2
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 11.
 * </pre>
 *
 * @author 		:playblock
 * @version 	: 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Person[] introduce ={
					new Person("Tom"),
					new Korean("홍길동"),
					new Japanese("다나카"),
					new Chinese("왕밍")
			};
			
			for(int i = 0; i<introduce.length; i++)
			{
				System.out.println(introduce[i].toString());
				introduce[i].sayHello();
				introduce[i].sayBye();
				System.out.println();
			}
			
			
	}

}
