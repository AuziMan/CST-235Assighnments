package beans;


public class Order {
	
	String OrderNumber;
	String ProductName;
	float Price;
	int Quantity;
	
	public Order(String Order, String Name, float Price, int Quantity){
		OrderNumber = " ";
		ProductName = " ";
		Price = 0;
		Quantity = 0;
	}

	public String getOrderNumber() {
		return OrderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	

}
