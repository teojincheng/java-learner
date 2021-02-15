import java.util.Timer;
import java.util.TimerTask;

public class main {

	public static void main(String[] args) {
		Sim tim = new Sim(10);
		Food seaweed = new Food(5,5);
		tim.eat(seaweed);

		
		
		
		/*
		System.out.println("---------------------------------------------------------");
		System.out.println("LSims");
		System.out.println("---------------------------------------------------------");
		System.out.println(tim.getHunger());
		*/

	}

}
