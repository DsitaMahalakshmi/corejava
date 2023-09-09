package oops;
 class Rectangle{
	 private double length;
	 private double width;
	 public Rectangle() {
		 length=0;
		 width=0;
		 
	 }
	 public Rectangle(double length, double width)
	 {
		 this.length=length;
		 this.width=width;
		 
	 }
	 public double getArea()
	 {
		 return length*width;
	 }
 }
 class Box extends Rectangle{
	 private double height;
	 public Box() {
		 super();
		 height=0;
    }
	 
		 public Box(double length,double width,double height )
		 {
			 super(length,width);
			 this.height=height;
		 }
		 public double getVolume() {
			 return getArea()*height;
		 }
		 
 }
	 
  public class SuperConstructor {

	public static void main(String[] args) {
		Box b=new Box();
		System.out.println("volume:"+b.getVolume());
		Box b1=new Box(12.2,13.9,2.0);
		System.out.println("volume:"+b1.getVolume());

	}

}
