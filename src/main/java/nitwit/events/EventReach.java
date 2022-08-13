package nitwit.events;

public class EventReach extends Event2 {
	
	private double reach;
	
	public EventReach(double reach) {
		super(false);
		this.reach = reach;
	}

	public double getReach() {
		return reach;
	}

	public void setReach(double reach) {
		this.reach = reach;
	}

}
