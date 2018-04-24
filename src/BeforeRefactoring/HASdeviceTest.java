package BeforeRefactoring;

import static org.junit.Assert.*;

import org.junit.Test;

public class HASdeviceTest {

	@Test
	public void test() {
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
