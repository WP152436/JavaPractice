/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *	|_ PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author 		:playblock
 * @version 	: 1.0
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Person p = new Person("Tom");
			Japanese j = new Japanese("다나카");
			Chinese c = new Chinese("왕밍");
			Korean k = new Korean("홍길동");
			System.out.println(p.toString());
			System.out.println(k.toString());
			System.out.println(j.toString());
			System.out.println(c.toString());
			
			System.out.println();
			
			p.sayHello();
			k.sayHello();
			j.sayHello();
			c.sayHello();
			
			System.out.println();
			
			p.sayBye();
			k.sayBye();
			j.sayBye();
			c.sayBye();
			
			
	}

}
