package ex03;
import java.util.Scanner;

public class for실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum = 0;
		System.out.println("숫자 5개를 입력하세요");
		
		
		for (int n=1;n <=5;n++) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sum += num; // num = num + sum
		
			System.out.println("합계 : " + sum);
			
		}
		
	}

}
