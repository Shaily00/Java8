

interface MyInterface{
	
	public int add(int a, int b);
}
public class Test {

	public static void main(String[] args) {
		
		MyInterface sum= (int a, int b)-> {
			System.out.println("sum = ");
			return (a+b);};
		
		int total = sum.add(1, 2);
		System.out.println(total);
		// TODO Auto-generated method stub

	}

}
