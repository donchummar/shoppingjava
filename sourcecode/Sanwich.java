
public class Sanwich extends Item {
	public Sanwich() {
		name = "Burger";
		processingTime = 3000;
	}
	
	public void setOrderid(String inOrderId){
		orderId = inOrderId;
	}
}
