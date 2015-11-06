import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;


public class Utils {
	private static AtomicInteger mSequenceGenerator = new AtomicInteger();
	
	public static String getSystemTime(){
		return new SimpleDateFormat("hh:mm:ss a").format(Calendar.getInstance().getTime());
	}

	public static int createOrderId(){
		return mSequenceGenerator.incrementAndGet();
	}
}
