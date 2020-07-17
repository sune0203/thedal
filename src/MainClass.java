/*
 * 메인 클래스
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {

		System.out.println("메인 클래스");
		MyClass4 mc4 = new MyClass4();
		Random rd = new Random();
		
		ArrayList<Integer> list = mc4.random(rd.nextInt(89)+10, rd.nextInt(89)+10);
		
			for(;;) {
				System.out.print(list.get(0)+" + "+list.get(1)+ " = ");
				if(list.get(2) == mc4.input()) {
					break;
				}
			}
			System.out.println("정 답 : "+list.get(2));
	}
}
