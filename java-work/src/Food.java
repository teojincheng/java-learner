
public class Food {
 private int hungerSatisfaction;
 private int timeToConsume;
 
 
 public Food(int pHungerSatisfaction, int pTimeToConsume) {
	 hungerSatisfaction = pHungerSatisfaction;
	 setTimeToConsume(pTimeToConsume);
 }

public int getHungerSatisfaction() {
	return hungerSatisfaction;
}

public void setHungerSatisfaction(int hungerSatisfaction) {
	this.hungerSatisfaction = hungerSatisfaction;
}

public int getTimeToConsume() {
	return timeToConsume;
}

public void setTimeToConsume(int timeToConsume) {
	this.timeToConsume = timeToConsume;
}
}
