import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class jav8Stream1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(5);
		
		
		/*int sumIterator = sumIterator(list);
		System.out.println(sumIterator);*/
		
		sumWithLambda(list);
		//System.out.println(sumWithLambda);
	}
	
	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}
	
	private static void  sumWithLambda(List<Integer> list){
		
		//list.forEach(p->System.out.println(p));
		
		int sum = list.stream().filter(i->i>10).mapToInt(i-> i).sum();
		System.out.println("Sum = "+sum);
		
		int first = list.stream().filter(i->i>10).findAny().get();
		System.out.println("first = "+first);
		return;
		
		
	}

}
