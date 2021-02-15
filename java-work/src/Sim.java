import java.util.Timer;
import java.util.TimerTask;

public class Sim {
     private int hunger; 
     private final Timer timer = new Timer();
	 private final	TimerTask task = new TimerTask() {
			 int count = 0; 
		    @Override
		    public void run() {
		    	if(count == 4) {
					task.cancel();
				}
		        System.out.println("Eating");
		        count++;
		    }
		};
     public Sim(int pHunger) {
    	 hunger=pHunger;
     }
	public int getHunger() {
		return hunger;
	}
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	
	public void eat(Food foodObj) {
		timer.schedule(task, 0, foodObj.getTimeToConsume()*1000);
		this.hunger -= foodObj.getHungerSatisfaction();
	}
}
