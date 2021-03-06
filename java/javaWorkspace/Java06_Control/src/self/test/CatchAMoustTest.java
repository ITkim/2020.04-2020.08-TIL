package self.test;

import java.util.Scanner;

class CatchAMouse{
	public static String solv(int x, int y, int z) {
		if(Math.abs(x-z) < Math.abs(y-z)) {
			return "CatA catch!";
		}
		else if(Math.abs(x-z) > Math.abs(y-z)) {
			return "CatB catch!";
		}
		else {
			return "Mouse Escapes!";
		}
		/*
		 * 구현...
		 * Math.abs()
		 */
	}
}
public class CatchAMoustTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CatA의 좌표를 입력하세요>>>");
		int cata = sc.nextInt();
		System.out.println("CatB의 좌표를 입력하세요>>>");
		int catb = sc.nextInt();
		System.out.println("Mouse의 좌표를 입력하세요>>>");
		int mouse = sc.nextInt();
		// 순서대로 값을 입력받고
		// 입력받은 값을 CatchAMouse에 값을 넣으면 됨. 근데 static이니까 객체 생성 필요X.
		String result = CatchAMouse.solv(cata, catb, mouse); 
		// 클래스가 달라서 CatchAMouse.solv로 해주거나 CatchAMouse에 있는 메소드를 복사해서 같은 클래스 안에 넣어주면 됨.
		System.out.printf("Result :: %s", result);

	}

}
