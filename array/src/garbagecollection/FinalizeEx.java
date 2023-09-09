package garbagecollection;

public class FinalizeEx {
  String s;
  public FinalizeEx(String s)
  {
	  this.s=s;
	  
  }

	public static void main(String[] args) {
		FinalizeEx t1=new FinalizeEx("t1");
		 FinalizeEx t2=new FinalizeEx("t2");
		 
		 t1=t2;
		 t1=null;
		 t2=null;
		 System.gc();
		 
		 
	}
	@Override

	protected void finalize() throws Throwable {
		System.out.println("Object previously referenced by " + this.s + " is successfully garbage collected.");
	}

}
