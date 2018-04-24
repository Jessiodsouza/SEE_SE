package BeforeRefactoring;

public class light {
	
	int on=1;
	String name="bulb";
	
	public void turnOn(){
		on=0;
		System.out.println("Light is Turned On");
	}
	public void turnOff(){
		on=1;
		System.out.println("Light is Turned Off");
	}
}
