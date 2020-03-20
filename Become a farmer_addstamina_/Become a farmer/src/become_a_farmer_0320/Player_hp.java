package become_a_farmer_0320;

import javax.swing.JLabel;

public class Player_hp extends Thread{
	
	static int hp = 100;
	
    JLabel player_hp = new JLabel();
    
    public Player_hp(JLabel player_hp)
    {
        this.player_hp = player_hp;
    }
    
    public void run()
    	{
            hp -= 10;
            player_hp.setText("         Ã¼·Â: "+hp);
            System.out.println(hp);
    }
   
    /*
	public class Player_hp {

	static int hp = 100;
	int money = 10000;
	int level;	
	
	JLabel timerLabel = new JLabel();
	
	void topdressing(){
		hp -= 10;
		System.out.println(hp);
	}*/
}
