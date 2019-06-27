import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Excercise3 {
public HashMap<Integer,Integer> getSquares(List<Integer> l){
	HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
	for(int i=0;i<l.size();i++) {
		int num=l.get(i);
		hm.put(num,num*num);
	}
	return hm;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=s.nextInt();
	List<Integer> l=new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		System.out.println("Enter an Integer");
		int num=s.nextInt();
		l.add(num);
	}
	Excercise3 e=new Excercise3();
	HashMap<Integer,Integer> hm=e.getSquares(l);
	for(Integer i:hm.keySet()) {
		System.out.println(hm.get(i));
	}
}
}
