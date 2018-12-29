package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class prioritys {
	
	@BeforeClass
	public void u(){
		
		System.out.println("Before class..");
	}
	
	@BeforeMethod
	public void harsha(){
		System.out.println("..DB Connections are made");
	}
	
	@Test
	public static void m1(){
		
		System.out.println("Hello prioritys111...");
	}
	
	@Test
	public static void m2(){
		
		System.out.println("Hello prioritys22222...");
	}
	
	
	
	
	@AfterClass
	public void harsh(){
		System.out.println("After class....DB Connection are un dismissed");
	}

}
