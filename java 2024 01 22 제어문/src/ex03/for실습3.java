package ex03;
import java.util.Scanner;

public class for실습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
//키보드로 입력받은 5개 숫자 합 구하기
	System.out.println("5개 숫자합은? ");	
	int nu = 0;
	
	for(int b = 0; b <=100; b++) {
		Scanner sc = new Scanner(System.in);
        int num   = sc.nextInt();		
        		nu += num; // nu = nu+num
      System.out.println("합계 : "+ nu);
		
			}
		
	}}
		
	


