package com.kh.practice3.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

import com.kh.practice3.model.Farm;

public class FarmController {

	private HashMap<Farm, Integer> hMap = new HashMap<>(); // 마트에서 농산물 저장용
	private ArrayList<Farm> list = new ArrayList<>(); // 고객이 구매한 농산물 저장용

	public boolean addNewKind(Farm f, int amount) {
		// containsKey() : map에 key가 존재하는가
		// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때

		// f와 amount를 각각 키와 값으로 저장 후 true 반환

		// 존재할 경우 false 반환
//		Set<Entry<Farm, Integer>> entries = hMap.entrySet();
//		for(Entry<Farm, Integer> entry : entries) {
//			if(!(entry.getKey() == f)) {
//				hMap.put(f, amount);
//				return true;
//			}
//	
//		}

		/*
		 * Set<Farm> keys = hMap.keySet();
		 * 
		 * for (Farm key : keys) {
		 * 
		 * if (key.getKind().equals(f.getKind()) && key.getName().equals(f.getName())) {
		 * 
		 * return false; }
		 * 
		 * }
		 * 
		 * hMap.put(f, amount);
		 * 
		 * 
		 * 
		 * return true;
		 * 
		 */

		if (!hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		}

		return false;

	}

	public boolean removeKind(Farm f) {

		// 전달 받은 f가 hMap 안에 key로 존재할 때
		// hMap에 f 삭제 후 true 반환

		// 존재하지 않을 경우 false 반환

		/*
		
		Set<Farm> keys = hMap.keySet();

		for (Farm key : keys) {

			if (key.getKind().equals(f.getKind()) && key.getName().equals(f.getName())) {

				hMap.remove(key);

				return true;
			}

		}
		

		return false;
		
		*/
		
		
		if(hMap.containsKey(f)) { 
			hMap.remove(f); 
			return true; 
		}
		 
		return false;
		 
	}

	public boolean changeAmount(Farm f, int amount) {

		// 전달 받은 f가 hMap 안에 key로 존재할 때
		// f와 amount 저장 후 true 반환

		// 존재하지 않을 경우 false 반환
		
		/*
		
		Set<Farm> keys = hMap.keySet();

		for (Farm key : keys) {

			if (key.getKind().equals(f.getKind()) && key.getName().equals(f.getName())) {

				hMap.put(key, amount);

				return true;
			}

		}

		return false;

		*/
		
		
		if(hMap.containsKey(f)) { 
			hMap.put(f, amount); 
			return true; 
		} 
		
		return false;
		 
	}

	public HashMap<Farm, Integer> printFarm() {
		return hMap;
	}

	// 고객 관련 기능 ------------------------------------------------------------

	public boolean buyFarm(Farm f) {

		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 1개 이상 일 때
		// list에 f 추가, 그리고 hMap에 f 수량 1 감소, true 반환

		// 존재하지 않으면 false 반환

		/*
		
		Set<Farm> keys = hMap.keySet();

		for (Farm key : keys) {

			if (key.getKind().equals(f.getKind()) && key.getName().equals(f.getName())
					&& hMap.get(key).intValue() > 0) {

				list.add(f);
				int amount = hMap.get(key).intValue() - 1;
				changeAmount(f, amount);

				return true;
			}

		}

		return false;
		
		*/

		
		if(hMap.containsKey(f) && hMap.get(f) > 0) { 
			list.add(f); 
			hMap.put(f,hMap.get(f) - 1); 
			return true; 
		}
		 
		return false;
		 

	}

	public boolean removeFarm(Farm f) {

		// 전달 받은 f가 list에 존재할 때
		// list에 f 삭제, 그리고 hMap에 f 수량 1 증가, true 반환

		// 아니면 false 반환
		/*
		 * int index = 0;
		 * 
		 * Set<Farm> keys = hMap.keySet();
		 * 
		 * for(Farm List : list) { if(List.getName().equals(f.getName()) &&
		 * List.getKind().equals(f.getKind())) {
		 * 
		 * list.remove(index);
		 * 
		 * for(Farm key : keys) { if (key.getKind().equals(f.getKind()) &&
		 * key.getName().equals(f.getName())) { int amount = hMap.get(key).intValue() +
		 * 1; changeAmount(f, amount); return true; }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * index++; }
		 * 
		 * return false;
		 */

		if (list.contains(f)) {
			list.remove(f);
			hMap.put(f, hMap.get(f) + 1);
			return true;
		}

		return false;

	}

	public ArrayList<Farm> printBuyFarm() {
		return list;
	}
}
