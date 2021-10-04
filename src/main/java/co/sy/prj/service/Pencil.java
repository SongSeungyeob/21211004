package co.sy.prj.service;

public interface Pencil {
	void selectPencil();
	default void pencilInterface() {
		System.out.println("나는 인터페이스 객체다.");
	}
}

// default = interface에서만 사용 가능하며, 1.8Ver 이상에서만 사용 가능하다.
