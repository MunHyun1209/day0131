package arrays;

import java.util.HashMap;
import java.util.Map;

public class Collection03 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("a", 10);//저장한거
		map.put("a", 100);//a의value수정 (새로 저장하는게 아니라 중복이 안됨)
		map.put("a", 1000);//a의 value수정
		map.put("b", 1000);
		map.put(new String("b"), 10000);//b의 value 수정
		
		System.out.println(map.size());
		System.out.println(map.get("a"));
		System.out.println(map.get("b"));
	
	
	}

}
//