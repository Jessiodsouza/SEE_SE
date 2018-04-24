package BeforeRefactoring;

public class programMain {

	public static void main(String[] args) {
		
	
		HASdevice has1=new HASdevice("Archie");
		has1.addlights();
		has1.TurnOn("light");
		has1.displayDeviceList();
		
		HASdevice has2=new HASdevice("Shane");
		has2.addlights();
		has2.addAC();
		has2.addTV();
		has2.displayDeviceList();
	}

}
