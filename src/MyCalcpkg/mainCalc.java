package MyCalcpkg;

public class mainCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc obj = new MyCalc();
		MyCalc srm= new MyCalc();
		MyCalc mul=new MyCalc();
		MyCalc div=new MyCalc();
		int sum=obj.addition(345,567);
		int sub=srm.substraction(45,9);
		int mult=mul.multiply(23,5);
		int divi=div.divide(25,5);
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(divi);
		
		
	}
}
