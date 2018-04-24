package BeforeRefactoring;

public class AC {
	int on=1;
	int AC_temp=30;
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
		AC_temp++;
		System.out.println("Temperature: "+AC_temp);
	}
	public void tempDecrease(){
		AC_temp--;
		System.out.println("Temperature: "+AC_temp);
	}
	public String getName() {
		return name;
	}
}
