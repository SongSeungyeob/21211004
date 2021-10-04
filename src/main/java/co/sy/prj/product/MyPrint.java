package co.sy.prj.product;

import co.sy.prj.service.Pencil;
import co.sy.prj.service.RemoteController;

public class MyPrint implements RemoteController {

	private Pencil pencil;
	
	public MyPrint(Pencil pencil) {
		this.pencil = pencil;
	}
	
	@Override
	public void powerOn() {
		System.out.println("프린트 전원을 켠다.");

	}

	@Override
	public void powerOff() {
		System.out.println("프린트 전원을 끈다.");

	}

	public void toPrint() {
		System.out.println("나는 ");
		pencil.selectPencil();
	}
//	@Override
//	public void selectPencil() {
//		System.out.println("4B");
//	}

}
