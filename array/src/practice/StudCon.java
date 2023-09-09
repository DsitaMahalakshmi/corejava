package practice;
//constructor example for student
public class StudCon {
  int id;
  String name;
  int age;
  StudCon()
  {
	int id; 
  }
  void show()
  {
	 System.out.println("default constructor"); 
  }
  StudCon(int i,String n)
  {
	  id=i;
	  name=n;
	  
  }
  void dis()
  {
	  System.out.println("parameterised constructor");
  }
  StudCon(int i, String n,int a)
  {
	  id=i;
	  name=n;
	  age=a;
	  
  }
  void display()
  {
	  System.out.println(id+" "+name+" "+age);
  }
  
	public static void main(String[] args) {
		StudCon s= new StudCon(10, "sita");
		StudCon s1=new StudCon(111, "Devi", 23);
		s.show();
		s.dis();
		s.display();
		s1.display();
   
     
	}

}
