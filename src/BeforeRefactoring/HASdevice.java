package BeforeRefactoring;

public class HASdevice {

	homeowner owner=new homeowner();;
	Object[][] arr = new Object[6][2];
	int devices=0;

	public HASdevice(String name) {
		this.owner.Name=name;
	}
	public void addTV(){
		arr[devices][0]=new TV();
		arr[devices][1]="TV";
		devices++;
	}
	public void addAC(){
		arr[devices][0]=new AC();
		arr[devices][1]="AC";
		devices++;
	}
	public void addlights(){
		arr[devices][0]=new light();
		arr[devices][1]="light";
		devices++;
	}
	
	public void displayDeviceList(){
		System.out.println("USER: "+owner.getName() );
		for(int i=0;i<devices;i++){
			if(arr[i][1]=="AC")
				System.out.println("Device: "+((AC)arr[i][0]).name);
			if(arr[i][1]=="TV")
				System.out.println("Device: "+((TV)arr[i][0]).name);
			if(arr[i][1]=="light")
				System.out.println("Device: "+((light)arr[i][0]).name);
		}
		System.out.println("");
	}
	public void TurnOn(String string) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;arr[i][1]!=string && i<devices;i++);
		((light) arr[i][0]).turnOn();;
	}
}
