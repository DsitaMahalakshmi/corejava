package practice;

public class VehicleConEx {
	int types;
	 int wheels;
	 String car;
		String truck;
	
	VehicleConEx(){
		int wheels;
		 String car;
		String truck;
		System.out.println("wheels:" );
		System.out.println("default constructor ");
		
	}
	VehicleConEx(String car,String truck,int wheels){
		this.wheels=wheels;
		this.car=car;
		this.truck=truck;
		System.out.println("parameterised constructor");
		
	}
	

	public static void main(String[] args) {
		VehicleConEx v=new VehicleConEx();
		System.out.println("types of vehicles:"+v.types);
		v.types=2;
		System.out.println(v.types);
		v.wheels=4;
		System.out.println(v.wheels);
		
		
		

	}

}
