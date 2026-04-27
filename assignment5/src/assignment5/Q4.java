package assignment5;


enum TrafficLight{
	red(30),
	yellow(5),
	Green(25);
	
	
	private final int duration;

	private TrafficLight(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}
	
	public TrafficLight next() {
		switch (this) {
        case red:    return Green;
        case Green:  return yellow;
        case yellow: return red;
        default:     return red;
    }
		
	}
	public void display() {
		System.out.println(this.name() + " (" + duration + "s)");

		
	}
	
}

public class Q4 {

	public static void main(String[] args) {
		TrafficLight light=TrafficLight.red;
		for(int i=0;i<6;i++) {
			light.display();
			light=light.next();
		}

	}

}
