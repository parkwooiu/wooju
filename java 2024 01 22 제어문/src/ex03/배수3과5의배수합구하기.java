package ex03;

public class 배수3과5의배수합구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1~100사이에 3의배수이면서 5의 배수 합 구하고,갯구 구하기
		
		int sum = 0;
		int count = 0;
		
		for (int i = 1; i < 101; i++)
			
			if( i%3 == 0 && i%5 ==0 )
				sum +=i;
		        count++;
		        
		        System.out.println("3과5의 배수의 합은 : "+sum);
		        System.out.println("3과5의 배수의 갯수는 : "+count);
		        
		
		
		
		
		
	}

}
