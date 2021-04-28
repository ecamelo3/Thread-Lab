
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Random;


public class CarQueue{// implements Runnable{
		Queue<Integer> q = new LinkedList<Integer>();
		Random rand = new Random();
	
	public CarQueue() {	
		q.add(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(0);
		q.add(4);
	}
	
	public void addToQueue()
	{
		class toQueue implements Runnable
		{
			public void run() 
			{ 
		    	 try {
		    		q.add(rand.nextInt(6));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
	        } 
		}			
		Runnable r = new toQueue();	    
		Thread t = new Thread(r);
		t.start();		
	}
	
	public Integer deleteQueue() {
		try {
		//System.out.println("In the queue: " + q);
		return q.remove();
		}catch(NoSuchElementException e) {
			throw new NoSuchElementException();
		}
	}


}
