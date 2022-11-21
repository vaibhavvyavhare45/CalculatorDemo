package calc;

public class CalcyDemo {
	
	public static void main(String[] args) {
		CalcyDemo c=new CalcyDemo();
		
		System.out.println(c.add(10, 78,5,50));
	}
	public static int add(int num1,int num2) {
		return num1+num2;
		
	}
	public static int add(int num1,int...nums ) {
		int res=0;
		for (int i : nums) {
		res=res+i;
		}
		
		return num1+res;
		
	}
	
	

}
