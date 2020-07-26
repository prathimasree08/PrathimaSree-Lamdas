package PrathimaSree_Lamdas.LamdaStreams;
import java.util.*;
import java.util.function.Consumer;

public class Avg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Elements");
		int num = sc.nextInt();
		System.out.println("Enter elements with space and in the end give a character");
		List<Integer> a = new ArrayList<Integer>();
		try {
		while(true) {
			a.add(sc.nextInt());
		}
		} catch(Exception e) {
			
		}
		
		findAvg(a,(Integer n) -> System.out.println("Average"+ (n / (float)num)));
	}
	
	public static void  findAvg(List<Integer> l, Consumer<Integer> con) {
		int sum= 0;
		for(int i : l) {
			sum+=i;
		}
		con.accept(sum);
	}


}
