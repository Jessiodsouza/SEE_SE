package BeforeRefactoring;

public class AC {
	int on=1;
	int temp=30;
	String name="AC";
	
	public void turnOn(){
		on=0;
		System.out.println("AC is Turned On");
	}
	public void turnOff(){
		on=1;
		System.out.println("AC is Turned On");
	}
	public void tempIncrease(){
		temp++;
		System.out.println("Temperature: "+temp);
	}
	public void tempDecrease(){
		temp--;
		System.out.println("Temperature: "+temp);
	}
	public String getName() {
		return name;
	}
}
