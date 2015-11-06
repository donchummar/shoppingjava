import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;


public class Cheff extends Thread {

	BlockingDeque<Item> orders;
	
	public Cheff(BlockingQueue<Item> bQueue) {
		orders = (BlockingDeque<Item>) bQueue;
	}
	
	@Override
	public void run() {
		super.run();
		 while (true) {
             try {
            	 Item data = orders.take();
                 //System.out.println("picked up for processing " + data.getId() +" at " + Utils.getSystemTime());
                 FileUtils.writeToFile("picked up " + data.getId() +" at " + Utils.getSystemTime());
                 FileUtils.writeToFile("Cooking " + data.getName() +"....");
                 Thread.sleep(data.getProcessingTime());
                 FileUtils.writeToFile("Finished making " + data.getName() + " for " + data.getId() + " at " + Utils.getSystemTime());
             } catch (InterruptedException e) {
                 System.err.println("Error occurred:" + e);
             }
         }
	}
}
