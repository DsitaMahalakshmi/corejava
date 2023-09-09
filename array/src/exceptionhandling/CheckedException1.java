package exceptionhandling;

public class CheckedException1 {

	public static void main(String[] args) {
		try {
			int c=10/5;
			System.out.println("value of c is:"+c);
			int a[]= {1,2,3,4,5};
			a[2]=56;
			System.out.println(a[2]);
			int a1=Integer.parseInt("1234");
			System.out.println(a1);
			String data=null;
			System.out.println(data.length());
			Number[]  bigInt=new Number[5];
			bigInt[0]=Double.valueOf(12345);
			
		}
		catch(ArithmeticException e) {
			System.out.println("nuumber cannot divide by zero "+e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}
		catch(NumberFormatException e2)
		{
			System.out.println(e2);
		}
		catch(StringIndexOutOfBoundsException e4) {
			System.out.println(e4);
		}
		catch(ArrayStoreException e3) {
			System.out.println(e3);
		}
		finally {
			System.out.println("end of code");
		}
		
	}

}
