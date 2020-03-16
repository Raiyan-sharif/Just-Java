import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Main {
	public static void main (String[] args)
	{
		
		Random rand = new Random();
		
		// create a queue of capacity 5
		Queue q = new Queue(5);
		Queue serviceTime = new Queue(5); 
		// This will take random number between 1 to 5
		//I First passenger arrives 
		q.enqueue(rand.nextInt(5)+1);
		
		//III a Next passenger
		
		q.enqueue(rand.nextInt(5)+1);
		q.enqueue(rand.nextInt(5)+1);
		

		int arivalTime = q.peek();
		for(int i=arivalTime; i>=0;i--) {
			if(i==0 && !q.isEmpty()) {
				q.dequeue();
				arivalTime = q.peek();
				int currentTime = (int) (new Date().getTime()/1000);
				serviceTime.enqueue(rand.nextInt(5)+1 + currentTime); 
			}
			System.out.println("Arrival Time of next passanger "+i );
		}
//		System.out.println("Front element is: " + q.peek());
//		q.dequeue();
//		System.out.println("Front element is: " + q.peek());
//
//		System.out.println("Queue size is " + q.size());
//
//		q.dequeue();
//		q.dequeue();
//		
//		if (q.isEmpty())
//			System.out.println("Queue Is Empty");
//		else
//			System.out.println("Queue Is Not Empty");
	}
}
