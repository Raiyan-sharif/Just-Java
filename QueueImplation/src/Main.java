
import java.util.Calendar;
import java.util.Date;
import java.util.Random; 
public class Main {
	public static void main (String[] args)
	{
		
		Random rand = new Random();
		
		// create a queue of capacity 5
		Queue q = new Queue(5);
		
		// This will take random number between 1 to 5
		//I First passenger arrives 
		q.enqueue(rand.nextInt(5)+1);
		
		//III a Next passenger
		
		q.enqueue(rand.nextInt(5)+1);
		q.enqueue(rand.nextInt(5)+1);
		
		
//		Calendar cal = Calendar.getInstance(); // creates calendar
//	    cal.setTime(new Date()); // sets calendar time/date
//	    cal.add(Calendar.HOUR_OF_DAY, 1); // adds one hour
//	    cal.getTime(); // returns new date object, one hour in the future
		
		
		System.out.println("Front element is: " + q.peek());
		q.dequeue();
		System.out.println("Front element is: " + q.peek());

		System.out.println("Queue size is " + q.size());

		q.dequeue();
		q.dequeue();
		
		if (q.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");
	}
}
