package co.sy.prj;

import co.sy.prj.service.RemoteController;

public class TestInterface {
	private RemoteController rc;
	
	public TestInterface(RemoteController rc) {
		this.rc = rc;
	}
	
	public String toString() {
		rc.powerOn();
		rc.powerOff();
		return null;
	}
	
	public RemoteController rcReturn() {
		return rc;
	}
}
