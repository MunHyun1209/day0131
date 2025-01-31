package arrays;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest02 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		char[]arr = new char[] {'A'};
		list.add("A");//0
		list.add("B");//1
		list.add("C");//
		list.add("B");
		list.add("A");
		//list.add(new String({'A'}));//->안됨
		list.add(new String(arr));
		list.add(new String(new char[] {'B'}));//이건 가능//6
		System.out.println(list.size());
		for(int i=1; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
