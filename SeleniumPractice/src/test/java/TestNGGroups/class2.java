package TestNGGroups;

import org.testng.annotations.Test;

public class class2 {
	
	
	@Test(priority=1,groups="Smoke")
	public void FirstProgrammofclass2()
	{
		System.out.println("This is FirstProgrammofclass2");
	}
	
	@Test(priority=2,groups="Smoke")
	public void SecondProgrammofclass2()
	{
		System.out.println("This is 2Programmofclass2");
	}
	
	@Test(priority=3,groups="Regression")
	public void ThirdProgrammofclass2()
	{
		System.out.println("This is 3Programmofclass2");
	}
	
	@Test(priority=4,groups="Regression")
	public void FourthProgrammofclass2()
	{
		System.out.println("This is 4Programmofclass2");
	}
	
	@Test(priority=5,groups={"Smoke", "Regression"})
	public void FiveProgrammofclass2()
	{
		System.out.println("This is 5Programmofclass2");
	}

}
