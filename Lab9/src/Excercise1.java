import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Excercise1 {
	public List<Integer> getValues(HashMap hm){
		Collection<Integer> c=hm.values();
		List<Integer> l=new ArrayList<Integer>(c);
		Collections.sort(l);
		return l;
	}

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=s.nextInt();
	HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
	for(int i=0;i<n;i++) {
		System.out.println("Enter an Integer");
		hm.put(i,s.nextInt());
	}
	Excercise1 e=new Excercise1();
	List l=e.getValues(hm);
	System.out.println("Sorted List");
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	
}
}
