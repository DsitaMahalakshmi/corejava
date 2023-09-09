package controlstatements;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FunctionEvenOdd {
	void even(int no)
	{
		if(no%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
		
	

	public static void main(String[] args) throws NumberFormatException,IOException {
		FunctionEvenOdd s=new FunctionEvenOdd();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter ur number");
      int no=Integer.parseInt(br.readLine());
      s.even(no);
	}

}
