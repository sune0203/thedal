import java.util.*;
public class MyClass4 {
	int a, b;
	int hap;
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	public int input() {
		return sc.nextInt();
	}
	
	public ArrayList<Integer> random(int a , int b) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(a+b);
		return list;
	}
	

/*
 * public ArrayList<Integer> 변수() {
 * 	ArrayList<Integer> list = new arrayList<Integer>();
 * list.add (*************)
 * 	return list;
 * }
 * 
 */
}
