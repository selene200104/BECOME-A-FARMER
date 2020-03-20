package become_a_farmer_0320;

import javax.swing.JLabel;

public class GameTime extends Thread{
	
	int timer = 1;
	
    JLabel timerLabel = new JLabel();
    
    public GameTime(JLabel timerLabel)
    {
        this.timerLabel = timerLabel;
    }
    
    public void run()
    {
        while(true)
        {
        	timerLabel.setText("         ½Ã°£:  "+timer);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timer++;
        }
    }
}
