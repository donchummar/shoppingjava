
public class Coffee extends Item {
	public Coffee() {
		name = "Coffee";
		processingTime = 2000;
	}
	
	public void setOrderid(String inOrderId){
		orderId = inOrderId;
	}
}
