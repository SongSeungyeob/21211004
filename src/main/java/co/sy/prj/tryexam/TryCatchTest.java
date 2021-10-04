package co.sy.prj.tryexam;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TryCatchTest {
	
	public void method1() throws Exception {
		//Class clazz = Class.forName("co.sy.prj.TestInterface");
		Class clazz = Class.forName("co.sy.prj.TV");
		System.out.println("원하는 클래스가 존재합니다.");
//		try {
//			Class clazz = Class.forName("co.sy.prj.TestInterface");
//			//Class clazz = Class.forName("co.sy.prj.TV");
//			System.out.println("원하는 클래스가 존재합니다.");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("예기치 않는 오류가 발생되었습니다.");
//			System.out.println("관리자에게 문의 하세요.");
//		} 
 	}
}
