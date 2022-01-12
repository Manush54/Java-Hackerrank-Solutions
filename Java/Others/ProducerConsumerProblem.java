/** Q6 WAP fot the producer-consume synchronization problem. The problem describes two
processes, the producer and the consumer, which share a common, fixed-size buffer
used as a queue. The producer’s job is to generate data, put it into the buffer, and start
again. At the same time, the consumer is consuming the data (i.e. removing it from the
buffer), one piece at a time. */

public class ProducerConsumerProblem {

  public static void main (String [] args) {
    Buffer buf = new Buffer();


    Thread prod = new Producer(5, buf);
    Thread cons = new Consumer(5, buf);


    prod.start();
    cons.start();

//    Wait for the threads to finish
   try {
   	prod.join();
   	cons.join();
   } catch (InterruptedException e) {return;}
  }

}

class Buffer {
  		private int contents;
  		private boolean empty = true;

  		public synchronized void put (int i) throws InterruptedException {
  			while (empty == false) { 	//wait till the buffer becomes empty
  				try { wait(); }
  				catch (InterruptedException e) {throw e;}
  			}
  			contents = i;
  			empty = false;
  			System.out.println("Producer: put..." + i);
  			notify();
  		}

  		public synchronized int get () throws InterruptedException {
  			while (empty == true)  {	//wait till something appears in the buffer
  				try { 	wait(); }
  				catch (InterruptedException e) {throw e;}
  			}
  			empty = true;
  			notify();
  			int val = contents;
  			System.out.println("Consumer: got..." + val);
  			return val;
  		}
}


 class Producer extends Thread {
  	private int n;
  	private Buffer prodBuf;

  	public Producer (int m, Buffer buf) {
  		n = m;
  		prodBuf = buf;
    }

    public void run() {
    	for (int i = 0; i < n; i++) {
    		try {
    			Thread.sleep(1000); // sleep for a randomly chosen time
    		} catch (InterruptedException e) {return;}

    	    try {
    	    	prodBuf.put(i + 1); //starting from 1, not 0
    	    } catch (InterruptedException e) {return;}

    	}
    }
  }

 class Consumer extends Thread {
  	private int n;
  	private Buffer consBuf;

  	public Consumer (int m, Buffer buf) {
  		n = m;
  		consBuf = buf;
    }

    public void run() {
    	for (int i = 0; i < n; i++) {
			try {
    			consBuf.get();
    		}  catch (InterruptedException e) {return;}
    		try {
    			Thread.sleep(1000); // sleep for a randomly chosen time
    		} catch (InterruptedException e) {return;}

    	}
    }
  }

