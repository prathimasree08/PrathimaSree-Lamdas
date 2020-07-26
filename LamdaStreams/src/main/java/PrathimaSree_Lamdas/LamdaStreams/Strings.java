package PrathimaSree_Lamdas.LamdaStreams;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in a list");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		List<String> strings  = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			strings.add(sc.next());
		}
		List<String> resultStrings  = find(strings, (String str) -> str.charAt(0) == 'a' && str.length() == 3);
		System.out.println("Strings that start with 'a' character and having length 3 are " + resultStrings);
	}
	public static List<String> find(List<String> strings, Predicate<String> predicate) {
		List<String> result = new ArrayList<String>();
		for(String str : strings) {
			if(predicate.test(str)) {
				result.add(str);
			}
		} return result;
	}

}
