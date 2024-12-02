import java.util.*;
class Product
{
	private int p_Id,p_Price,p_Quantity;
	private String p_Name;
	
	public void setId(int p_Id)
	{
		this.p_Id=p_Id;
		
	}
	public int getId()
	{
		return p_Id;
	}
	
	
	public void setPrice(int p_Price)
	{
		this.p_Price=p_Price;
		
	}
	public int getPrice()
	{
		return p_Price;
	}
	
	
	public void setQuantity(int p_Quantity)
	{
		this.p_Quantity=p_Quantity;
		
	}
	public int getQuantity()
	{
		return p_Quantity;
	}
	
	
	public void setName(String p_Name)
	{
		this.p_Name=p_Name;
		
	}
	public String  getName()
	{
		return p_Name;
	}
}

class Customer
{
	 
	private long c_Contact;
	private String c_Name,c_Address,c_Id;
	
	public void setc_Id(String c_Id)
	{
		this.c_Id=c_Id;
	}
	public String getc_Id()
	{
		return c_Id;
	}
	
	
	
	public void setc_Contact(long c_Contact)
	{
		this.c_Contact=c_Contact;
	}
	public long getc_Contact()
	{
		return c_Contact;
	}
	
	
	public void setc_Name(String c_Name)
	{
		this.c_Name=c_Name;
	}
	public String getc_Name()
	{
		return c_Name;
	}
	
	
	public void setc_Address(String c_Address)
	{
		this.c_Address=c_Address;
	}
	public String  getc_Address()
	{
		return c_Address;
	}
}

class Shop
{
Product []p;
Customer c;
void setProductDetails(Product []p,Customer c)
{
	this.p=p;
	this.c=c;
}

void CallBill()
{
	int totalBill=0;


	System.out.println("_______________________________________________________________________________________");
	System.out.println("CUSTOMER DETAILS ");	
	System.out.println("_______________________________________________________________________________________");
	System.out.println("Customer Name :"+c.getc_Name()+"\t\tId :"+c.getc_Id()+"\t\tAddress :"+c.getc_Address()+"\t\tContact :"+c.getc_Contact());
	System.out.println("_______________________________________________________________________________________");
	System.out.println("ORDER DETAILS ");
	
	System.out.println("\t\tId\t\tName\t\tprice\t\tQty\t\ttotal");
	
	
	for(int i=0;i<p.length;i++)
	{
		int totalp=0;
		 
		 int priceP=p[i].getPrice();
		 int Qtyp=p[i].getQuantity();
		 totalp=priceP*Qtyp;
		  totalBill=totalBill+totalp;
		System.out.println("\t\t"+p[i].getId()+"\t\t"+p[i].getName()+"\t\t"+p[i].getPrice()+"\t\t"+p[i].getQuantity()+"\t\t"+totalp);
	}
	
	System.out.println("_______________________________________________________________________________________");
	System.out.println("Total Bill of Produce = "+totalBill);
	
}


}
public class BillingApplication
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("____________________________enter the customer details _________________________________");
		System.out.println("enter the Id of customer ");
		String id=xyz.nextLine();
		
		System.out.println("enter the name of customer ");
		String name=xyz.nextLine();
		
		System.out.println("enter the contact number of customer ");
		long contact=xyz.nextLong();
		xyz.nextLine();
		System.out.println("enter the address of customer ");
		String address=xyz.nextLine();
		
		Customer c=new Customer();
		c.setc_Address(address);
		c.setc_Contact(contact);
		c.setc_Id(id);
		c.setc_Name(name);
		 
		 System.out.println("_________________________________________________________________________________________");
		 System.out.println("enter the products details");
		  System.out.println("_________________________________________________________________________________________");
		  System.out.println();
		 System.out.println("enter the number of products");
		 int num=xyz.nextInt();
		 
		 Product p[]=new Product[num];
		 for(int i=0;i<p.length;i++)
		 {
		 System.out.println("_______________________________________________________________________________________");
			
			
			System.out.println("enter the id ");
			int Id=xyz.nextInt();
				xyz.nextLine();
			System.out.println("enter the product name ");
			String Name=xyz.nextLine();	
			
			System.out.println("enter the quantity of product");
			int Qty=xyz.nextInt();
			
			System.out.println("enter the price of product");
			int Price=xyz.nextInt();
			
			p[i]=new Product();
			p[i].setId(Id);
			p[i].setName(Name);
			p[i].setPrice(Price);
			p[i].setQuantity(Qty);
		 }
		 Shop s=new Shop();
		 s.setProductDetails(p,c);
		 s.CallBill();
		 
	}
}