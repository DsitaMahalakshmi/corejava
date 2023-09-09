package exceptionhandling;
class Customer{
	int id;
	String name;
	double walletBalance;
	String address;

public Customer(int id, String name,double walletBalance,String address)
{
	this.id=id;
	this.name=name;	
	this.walletBalance=walletBalance;
	this.address=address;
}
}
class Item
{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id,String name,String companyName,double price,boolean isInStock)
	{
		this.id=id;
		this.name=name;
		this.companyName=companyName;
		this.price=price;
		this.isInStock=isInStock;
	}
}
class InSufficientBalanceException extends Exception{
	 InSufficientBalanceException(String message) {
		super(message);
	}
}
 class ItemOutOfStockException extends Exception{	 
	
    ItemOutOfStockException(String message){
    	super(message);
    	
    }
	  
  }

public class ShoppingWebsite {

	
	public String purchaseItem(Item i,Customer c)throws ItemOutOfStockException, InSufficientBalanceException {
	 if(!i.isInStock)
	 {
		 throw new ItemOutOfStockException("item is out of stock");
	 }
	 else if(i.price>c.walletBalance)
	 {
		 throw new InSufficientBalanceException("customer wallet balance is not sufficient"); 
	 }
	 else
	 {
		 return "Order Successful"; 
	 }
	}
	
	public static void main(String args[])throws ItemOutOfStockException,InSufficientBalanceException{
    	Customer cusDet=new Customer(927392,"steeve", 5000, "usa");
    	Item itemDet=new Item(2987,"T-shirt","uspolo",100,false);
    	ShoppingWebsite obj=new ShoppingWebsite();
    	
    	try {
    		String out=obj.purchaseItem(itemDet, cusDet);
    		System.out.println(out);
    	}
    	catch(ItemOutOfStockException e1)
    	{
    		System.out.println(e1.getMessage());
    	}
    	catch(InSufficientBalanceException e2)
    	{
    		System.out.println(e2.getMessage());
    	}
	}
}	
    	
      
	
