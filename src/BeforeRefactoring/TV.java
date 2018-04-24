package BeforeRefactoring;

public class TV {

	int on=1;
	int channel=0;
	int sound=0;
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
		channeldisplay();
	}
	public void channelPrevious(){
		channel--;
		channeldisplay();
	}
	public void channeldisplay(){
		System.out.println("Channel: "+channel);
	}
	
	
	public void volumeUp(){
		sound++;
		volumedisplay();
	}
	public void volumeDown(){
		sound--;
		volumedisplay();
	}
	public void volumedisplay(){
		System.out.println("Volume: "+sound);
	}
}
