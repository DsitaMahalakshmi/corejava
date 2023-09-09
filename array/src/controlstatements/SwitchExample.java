package controlstatements;
import java.util.Scanner;


public class SwitchExample {

	public static void main(String[] args) {
		int op;
		int num1,num2,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("choose an operator:1,2,3,4");
        op=sc.nextInt();
        System.out.println("operator==>"+op);
        System.out.println("enter first number");
        num1=sc.nextInt();
        System.out.println("enter second number");
        num2=sc.nextInt();
        switch(op)
        {
        case 1:
        	result=num1+num2;
        	System.out.println(num1+" +"+num2+" = "+result);
        	break;
        case 2:
        	result=num1-num2;
        	System.out.println(num1+" -"+num2+" = "+result);
        	break;
        case 3:
        	result=num1*num2;
        	System.out.println(num1+" * "+num2+" = "+result);
        	break;
        case 4:
        	result=num1/num2;
        	System.out.println(num1+" / "+num2+" = "+result);
        	break;
        	default:
        	System.out.println("invalid operator");
        }
	}

}
