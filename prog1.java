package collections;
import java.util.*;


public class prog1 {
	public static void main(String[] args) {
		System.out.println("jdkjs");
		ArrayList stList = new ArrayList();
		stList.add(501);
		stList.add(122);
		stList.add(123);
		stList.add(124);
		stList.add("abc");
		System.out.println(stList.size());
		System.out.println(stList.get(3));
		System.out.println(stList);
		
		/*for(Object obj : stList) {
			System.out.println(obj);
		}
		//Iterator
		/*Iterator listitr = stList.iterator();
		while(listitr.hasNext()) {
				Object objectRM = listitr.next();
				if((int)objectRM == 501) {
					listitr.remove();
				}
				System.out.println(objectRM);
			 //listitr.remove();
			  
				System.out.println(listitr.next());
		}*/
		//functional programming
		stList.forEach((sno)-> System.out.println(sno));
		LinkedList rollList = new LinkedList();
		rollList.add(42);
		rollList.add(42);
		rollList.add("jdwj");
		System.out.println(rollList);

		rollList.add(0,566);
		rollList.addAll(stList);
		System.out.println(rollList.reversed());
		System.out.println(rollList.set(0,000));
		
		System.out.println(rollList);
		Stack stack  = new Stack();
		stack.addAll(rollList);

		System.out.println(stack);

		System.out.println(stack.size());
		System.out.println(stack.capacity());
		HashSet hash  = new HashSet();
		hash.add(332);
		hash.add(28);
		hash.add("djl");
		hash.addAll(rollList);
		System.out.println(hash);
		stList.clear();
		stList.addAll(hash);
		
		
	}

}
