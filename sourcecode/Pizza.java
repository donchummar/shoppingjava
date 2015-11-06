
public class Pizza extends Item {
	public Pizza() {
		name = "Pizza";
		processingTime = 4000;
	}
	
	public void setOrderid(String inOrderId){
		orderId = inOrderId;
	}
}
