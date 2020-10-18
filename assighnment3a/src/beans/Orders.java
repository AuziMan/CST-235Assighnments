package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders {

	List<Order> orders = new ArrayList<Order>();
	
	public Orders()
	{
		
		orders.add(new Order("00000001", "This is product 1", (float)1.00, 1));
		orders.add(new Order("00000002", "This is product 2", (float)2.00, 2));
		orders.add(new Order("00000003", "This is product 3", (float)3.00, 3));
		orders.add(new Order("00000004", "This is product 4", (float)4.00, 4));
		orders.add(new Order("00000005", "This is product 5", (float)5.00, 5));
		orders.add(new Order("00000006", "This is product 6", (float)6.00, 6));
		orders.add(new Order("00000007", "This is product 7", (float)7.00, 7));
		orders.add(new Order("00000008", "This is product 8", (float)8.00, 8));
		orders.add(new Order("00000009", "This is product 9", (float)9.00, 9));
		orders.add(new Order("00000010", "This is product 10", (float)10.00, 10));
		
	}
	
	public List<Order> getOrders()
	{
		return orders;
	}
	
	public void setOrders(List<Order> orders)
	{
		this.orders = orders;
	}
	
}
