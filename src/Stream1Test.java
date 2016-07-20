import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1Test {
	public static void main(String[] args) {
		  // Count empty strings
	      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	      
	      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	      
	   /*   long filter = strings.stream().filter(x->x.length()>3).count();
	      System.out.println(filter);
	      
	      long count = strings.stream().filter(x->x.startsWith("a")).count();
	      System.out.println(count);
	      
	      long emptyStrCount = strings.stream().filter(x->x.isEmpty()).count();
	      System.out.println(emptyStrCount);
	      */
	    /*  //Remove all empty spaces from the list
	      List<String> removeEmptyList = strings.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
	      removeEmptyList.forEach(x->System.out.println(x));
	      
	      //Create the string for non-empty items of the list
	      String nonEmptyStr = strings.stream().filter(x->!x.isEmpty()).collect(Collectors.joining(" ,"));
	      System.out.println(nonEmptyStr);*/
	      
	      
	      numbers.stream().map(i->i*i).collect(Collectors.toList()).forEach(System.out::println);
	      
	      System.out.println("*****************************");
	      
	      numbers.stream().map(i->i*i).distinct().collect(Collectors.toList()).forEach(System.out::println);
	      
	      
	      //sum of all number items
	      int sum = numbers.stream().mapToInt(i->i).sum();
	      System.out.println("Sum = "+sum);
	      
	    /*  List<Integer> squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
	      System.out.println("Squares List: " + squaresList);*/
	     // System.out.println("List: " +integers);
	      
	      //highest number in list
	      int maxNum = numbers.stream().mapToInt(x->x).max().getAsInt();
	      System.out.println("maxNum = "+maxNum);
	      
	      //lowest number in list
	      int minNum = numbers.parallelStream().mapToInt(x->x).min().getAsInt();
	      System.out.println("minNum = "+minNum);
	      
	}

}
