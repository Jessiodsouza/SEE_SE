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
		System.out.println("USER: "+has2.owner.getName() );
		for(int i=0;i<has2.devices;i++){
			if(has2.arr[i][1]=="AC")
				System.out.println("Device: "+((AC)has2.arr[i][0]).name);
			if(has2.arr[i][1]=="TV")
				System.out.println("Device: "+((TV)has2.arr[i][0]).name);
			if(has2.arr[i][1]=="light")
				System.out.println("Device: "+((light)has2.arr[i][0]).name);
		}
		System.out.println("");
	}

}
