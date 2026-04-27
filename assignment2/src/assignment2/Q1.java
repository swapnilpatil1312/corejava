
package assignment2;

class invoice {
	
	 static String  partname;
	static String partnumber;
	static int partcount;
	static double partprice;
	
	public  invoice()
	{
		
	}
	public invoice(String partname,String partnumber,int partcount,double partprice)
	{
		this.partname=partname;
		this.partnumber=partnumber;
		this.partcount=partcount;
		this.partprice=partprice;
		
	}
	public static String getPartname() {
		return partname;
	}
	public static void setPartname(String partname) {
		invoice.partname = partname;
	}
	public static String getPartnumber() {
		return partnumber;
	}
	public static void setPartnumber(String partnumber) {
		invoice.partnumber = partnumber;
	}
	public static int getPartcount() {
		
			
		return partcount;
	}
	public static void setPartcount(int partcount) {
		if (partcount>0)
		{
			invoice.partcount = partcount;
		}
		else 
		{
			partcount = 0;
		}
		
	}
	public static double getPartprice() {
		return partprice;
	}
	public static void setPartprice(double partprice) {
		invoice.partprice = partprice;
	}
	
	
	
	
	
	
	
	
	
	
	
}




