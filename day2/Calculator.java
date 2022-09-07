package week1.day2;

public class Calculator{
	public void addNumbers(int a,int b) {
		
		System.out.println("Addition value"    +   ( a+b));
	}
		public void subractNumbers(int a,float b,int c) {
			 
			
			System.out.println("subraction value"   +   (a-b-c));
	}

	public static void main(String[] args) {
		Calculator prob=new Calculator();
	prob.addNumbers(4,5);
	prob.subractNumbers(3,5.3f,8);
	}

}
