/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *	|_ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author 		:playblock
 * @version 	: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int money = 1700000;
		int employee = 3;
		int store = 1500;
		long total = 1700000*12*3*1500l;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", money) + "원");
		System.out.println("점포 내 직원 수 : " + employee + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개");
		System.out.println("");
		System.out.println("연간 인건비 : " + String.format("%,d", (long)money*employee*store*12) + "원");

	}

}
