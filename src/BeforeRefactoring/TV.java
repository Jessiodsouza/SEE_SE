package BeforeRefactoring;

public class TV {

	int on=1;
	int channel=0;
	int volume=0;
	String name="TV";
	
	public void turnOn(){
		on=0;
		System.out.println("TV is Turned On");
	}
	public void turnOff(){
		on=1;
		System.out.println("TV is Turned Off");
	}
	public void channelNext(){
		channel++;
		System.out.println("Channel: "+channel);
	}
	public void channelPrevious(){
		channel--;
		System.out.println("Channel: "+channel);
	}
	public void volumeUp(){
		volume++;
		System.out.println("Volume: "+volume);
	}
	public void volumeDown(){
		volume--;
		System.out.println("Volume: "+volume);
	}
}
