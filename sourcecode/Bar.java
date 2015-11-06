import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;


public class Bar {

	public static void main(String[] args) {
		BlockingDeque<Item> mainBQueue = new LinkedBlockingDeque<>();	
		new Waiter(mainBQueue).start();
		new Cheff(mainBQueue).start();
	}
}
