package co.sy.prj;

import co.sy.prj.tryexam.TryCatchTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) // throws Exception
    {
    	  
    	TryCatchTest trycatchtest = new TryCatchTest();
    	try {
			trycatchtest.method1();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("항살 실행");
		}
    	
//    	  MyPrint myPrint = new MyPrint(new Pencil4B());
//    	  myPrint.toPrint();
    	   
//    	  RemoteController rc;
//    	  rc = new LgTV();
//    	  TestInterface ts = new TestInterface(new SamsungTV());
//    	  
//    	  rc = ts.rcReturn();
//    	  rc.powerOn();
//    	  rc.powerOff();
//        ts.toString();
//    	  MyPrint myPrint = new MyPrint();
//    	  myPrint.powerOn();
//    	  myPrint.selectPencil();
//    	  myPrint.powerOff();
    
//        RemoteController tv = new SamsungTV();
//        tv.powerOn();
//        tv.powerOff();
//        
//        
//        tv = new LgTV();
//        tv.powerOn();
//        tv.powerOff();
//        
//        Pencil pencil = null;
//        pencil = new Pencil4B();
//        pencil.selectPencil();
//        pencil.pencilInterface();
//        
//        pencil = new Pencil6B();
//        pencil.selectPencil();
//        
//        pencil = new Pencil4B();
//        pencil.selectPencil();
    }
}
