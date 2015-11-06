import java.util.Scanner;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;


public class Waiter  extends Thread{


	BlockingDeque<Item> orders;

	public Waiter(BlockingQueue<Item> bQueue) {
		orders = (BlockingDeque<Item>) bQueue;
	}

	@Override
	public void run() {
		super.run();
		while (true) {
			System.out.println("Enter item id: ");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			Item item = ItemMenu.getItem(i);
			if (item != null){
				item.orderId = "ord" + Utils.createOrderId();
				orders.add(item);
				System.out.println("Order number " + item.orderId + " for "+ item.getName() + " placed at " + Utils.getSystemTime());
			}else {
				System.out.println("Sorry item not available");
			}
		}
	}
}
