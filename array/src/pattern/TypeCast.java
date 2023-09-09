package pattern;

public class TypeCast {

	public static void main(String[] args) {
		byte b=10;
		int i=b;//smaller datatype to bigger datatype conversion is called implict are also known as widening 
		System.out.println(i);
		int ii=30;
		byte b1=(byte)ii;
//bigger to smaller conversion is called explict are also known as Narrowing
	}

}
