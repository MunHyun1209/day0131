package arrays;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class CollectionTest {

	public static void main(String[] args) {
		
		Set<Integer>sets = new HashSet<Integer>();
		//Set<String>sets = new HashSet<String>(); 는 문자형 (" ") 있어야함
		//String은 .equals()로 비교함
		sets.add(10);
		sets.add(9);
		sets.add(8);
		sets.add(7);
		sets.add(8);
		sets.add(9);
		sets.add(10);

		for(int i=0; i<sets.size(); i++) {
			//System.out.println(sets.get(i));
		}
		Iterator<Integer>it= sets.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
