import java.util.ArrayList;
import java.util.List;

public class Java8ReductionExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		list.add("perl");
		list.add("c");
		list.add("lisp");
		list.add("c#");

		int sum1 = list.stream().map(x -> x.length()).mapToInt(Integer::new).sum();
		System.out.println(" sum1 = " + sum1);

		Integer sum2 = list.stream().map(x -> x.length()).reduce((x, y) -> x + y).get();
		System.out.println("Sum 2 = " + sum2);
		
		
		Integer sum3 = list.stream().map(x -> x.length()).reduce(0,(x, y) -> x + y);
		System.out.println("sum3 = "+sum3);
		
		int sum4 =  list.stream().reduce(0, (x, y) -> x + y.length(), (x, y) -> x + y);
		System.out.println("sum4 = "+sum4);
	}

}
