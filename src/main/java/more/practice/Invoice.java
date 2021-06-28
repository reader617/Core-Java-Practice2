package more.practice;

public class Invoice 
{
	private String partNumber;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice (String pn, String d, int q, double p)
	{
		partNumber = pn;
		description = d;
		quantity = q;
		price = p;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >= 0)
		{
			this.quantity = quantity;
		}
		else
		{	
			this.quantity = 0;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0)
		{	
			this.price = price;
		}
		else
		{
			this.price = 0.0;
		}
	}
	
	public double getInvoiceAmount()
	{
		return price * quantity;
	}
	
	public String toString()
	{
		String temp = "";

		temp = "Part Number: " + partNumber + "\n";
		temp += "Part Description: " + description + "\n";
		temp += "Quantity: " + quantity + "\n";
		temp += "Price: " + price + "\n";
		temp += "Invoice Amount: " + getInvoiceAmount();
		
		return temp;
	}
}
