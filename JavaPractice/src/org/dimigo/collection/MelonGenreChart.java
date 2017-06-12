/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *	|_ MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 *
 * @author 		:playblock
 * @version 	: 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Music> dance = new ArrayList<Music>();
		List<Music> ba = new ArrayList<Music>();

		Map<String, List<Music>> map = new HashMap<>();
		System.out.println("--<<멜론 장르별 챠트>>--");
		
		ba.add(new Music("팔레트", "아이유"));
		map.put("발라드", ba);
		dance.add(new Music("I LUV IT", "PSY"));
		dance.add(new Music("맞지?", "언니쓰"));
		map.put("댄스", dance);
		printMap(map);
		
		System.out.println("--<<댄스 2위곡 변경>>--");
		dance.set(1, new Music("SIGNAL","트와이스"));
		printMap(map);
		
		System.out.println("--<<댄스 1위곡 삭제>>--");
		dance.remove(0);
		printMap(map);
		
		System.out.println("--<<전체 리스트 삭제>>--");
		map.clear();
		printMap(map);
		
	}
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()){
			System.out.println("[" + key + "]");
			int i = 1;
			for(Music a : map.get(key)){
				System.out.println(i + "." + a.toString());
				i++;
			}
		}
		System.out.println();
	}

}
