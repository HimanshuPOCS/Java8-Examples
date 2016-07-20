import java.util.ArrayList;
import java.util.List;

public class ReduceExample2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		list.add("perl");
		list.add("c");
		list.add("lisp");
		list.add("c#");
		
		//Calculate sum of length of string
		
		/*int sum = list.stream().map(x->x.length()).mapToInt(Integer::new).sum();
		System.out.println("Sum = "+sum);
		

		int sum2 = list.stream().map(x->x.length()).mapToInt(x->x).sum();
		System.out.println("Sum2 = "+sum2);
		
		//using reduce
		Integer sumOut = list.stream().map(x->x.length()).reduce((x,y)->(x+y)).get();
		System.out.println("Sum reduce = "+sumOut);
		
		Integer sumOtherway = list.stream().map(x->x.length()).reduce(Integer::sum).get();
		System.out.println("sumOtherway "+sumOtherway);*/
		
		
		/*Stream<Integer> lengthStream = wordStream.map(s -> s.length());
		int sum = lengthStream.reduce(0, (x, y) -> x + y);
		System.out.println(sum);*/
		
		
		
	}
}
