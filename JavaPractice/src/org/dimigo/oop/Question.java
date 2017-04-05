/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *	|_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author 		:playblock
 * @version 	: 1.0
 */
public class Question {

	
	public static void main(String[] args) {
		
		String[] questions={"가수", "배우", "과목"};
		String[] answers = {"아이유", "서현진", "수학"};
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			if(i==2)
			{
				System.out.println("가장 좋아하는 " + questions[i] + "은?");

			}
			else{
				System.out.println("가장 좋아하는 " + questions[i] + "는?");
			}
			String answer= scanner.nextLine();
			if(answer.equals(answers[i]))
			{
				System.out.println("정답입니다!");
			}
			
			else
				System.out.println("틀렸습니다!");

		}
		System.out.println("<<결과출력>>");
		for (int i=0; i<3; i++)
		{
			StringBuilder sb = new StringBuilder("가장좋아하는");
			if(i==2)
			{
				sb.append(questions[i]).append("은? ").append(answers[i]).append("입니다.");
			}
			else{
				sb.append(questions[i]).append("는? ").append(answers[i]).append("입니다.");

			}
			System.out.println(sb);
		}		
		
		
		
		}

}
