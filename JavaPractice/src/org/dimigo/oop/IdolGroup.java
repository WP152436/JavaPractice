/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	|_ IdolGroup
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 10.
 * </pre>
 *
 * @author 		:playblock
 * @version 	: 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] groupName = {"빅뱅", "2NE1", "레드벨벳"};
		
		String[][] memberName = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "공민지"},
				{"아이린", "예리", "조이", "웬디", "슬기"}
		};
		
		for(int i=0; i<3; i++)
		{
			System.out.println("<<" + groupName[i] + ">>");
			for(int j = 0; j<memberName[i].length; j++)
			{
				System.out.println(memberName[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
		
	
}


