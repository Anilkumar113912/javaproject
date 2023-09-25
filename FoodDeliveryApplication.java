package firstjavaproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Zomato{
	int price;
	String item;
	String Location;
	int OrderNumber;
	int ID;
	@Override
	public String toString() {
		return "Zomato [price=" + price + ", item=" + item + ", Location=" + Location + ", OrderNumber=" + OrderNumber
				+ "ID="+ID+"]";
	}
	
	public Zomato(int price, String item, String location, int orderNumber,int ID) {
		super();
		this.price = price;
		this.item = item;
		this.ID = ID;
		Location = location;
		OrderNumber = orderNumber;
		
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		OrderNumber = orderNumber;
	}
}
public class FoodDeliveryApplication {
	
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Zomato> obj =new ArrayList<Zomato>();
		 Scanner S=new Scanner(System.in);
		 int choice;
		 do {
			 System.out.println("1 Insert Data");
			 System.out.println("2 Display Data");
			 System.out.println("3 Search Data");
			 System.out.println("4 Delete Data");
			 System.out.println("5 Updated Data");
			 System.out.println("Enter Your Choice");
			
			 choice = S.nextInt();
			 switch(choice) {
			 case 1:
				 
				 System.out.println("Enter ID");
				 int ID=S.nextInt();
				
				 System.out.println("Enter item");
				 String item=S.next();
				 
				 System.out.println("Enter price");
				 int price=S.nextInt();
				 
				 System.out.println("Enter location");
				 String Location=S.next();
				 
				 System.out.println("Enter orderNumber");
				 int orderNumber=S.nextInt();
				 
				 obj.add(new Zomato(price,item,Location,orderNumber,ID));
				 break;
			 case 2:
				 Iterator<Zomato>i= obj.iterator();
				 while(i.hasNext()) {
					 Zomato z=i.next();
					 System.out.println(z);
				 }
				 break;
			 case 3:
				 boolean found = false;
				 System.out.println("EnterID to search:");
				 int id = S.nextInt();
				 Iterator k = obj.iterator();
				 while(k.hasNext()) {
					 Zomato e=(Zomato)k.next();
					 if(e.getID()==id) {
						 System.out.println(e);
						 found = true;
					 }
				 }
				 
				 if(found == false) {
					 System.out.println("Record not Found");
				 }
				 else {
                      System.out.println("Record Found");
			 }
			 break;		
			 
			 case 4:
				 boolean found1 = false;
				 System.out.println("Enter ID want to Delete");
				 int sr=S.nextInt();
				 Iterator p=obj.iterator();
				 while(p.hasNext()) {
					 Zomato t=(Zomato)p.next();
					 if(t.ID==sr) {
						 p.remove();
						 found1=true;
					 }
					 }
		if(found1!=false) {
			System.out.println("Record is deleted");
		}
		else {
			System.out.println("Record not Found");
		}
			 case 5:
				 boolean found3 = false;
				 System.out.println("Update Id");
				 int sr1=S.nextInt();
				 Iterator p1=obj.iterator();
				 while(p1.hasNext()) {
					 Zomato t1=(Zomato)p1.next();
					 if(t1.ID==sr1) {
						 System.out.println("Enter Updated ID vaue");
						 int T=S.nextInt();
						t1.setID(T);
						 found3=true;
					 }
					 }
		if(found3!=false) {
			System.out.println("Record is Updated");
		}
		else {
			System.out.println("Record not Updated");
		}
			 }
		 }while(choice!=0);
	}

}
