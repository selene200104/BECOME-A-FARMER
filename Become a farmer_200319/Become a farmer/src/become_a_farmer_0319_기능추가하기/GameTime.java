package become_a_farmer_0319_����߰��ϱ�;

public class GameTime extends Thread{
	
	static int second ;
    
	public void run() {
		
		second = 1;
		
        while(true)
        {
            try {
            	System.out.println(second);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            second++;
        }
	}
}
