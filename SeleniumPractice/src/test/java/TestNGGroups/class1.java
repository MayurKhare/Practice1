package TestNGGroups;

import org.testng.annotations.Test;


public class class1 {
	
	@Test(priority=1,groups="Smoke")
	public void FirsstProgrammofClass1()
	{
		System.out.println("This is FirstProgrammofClass1");
	}
	
	@Test(priority=2,groups="Smoke")
	public void SecondProgrammofClass1()
	{
		System.out.println("This is 2ProgrammofClass1");
	}
	
	@Test(priority=3,groups="Regression")
	public void ThirdProgrammofClass1()
	{
		System.out.println("This is 3ProgrammofClass1");
	}
	
	@Test(priority=4,groups="Regression")
	public void FourthProgrammofClass1()
	{
		System.out.println("This is 4ProgrammofClass1");
	}
	
	@Test(priority=5,groups={"Smoke", "Regression"})
	public void FiveProgrammofClass1()
	{
		System.out.println("This is 5ProgrammofClass1");
	}

}
