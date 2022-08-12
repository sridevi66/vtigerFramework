package Practice;

import org.testng.annotations.Test;

public class sampleinnvocation {
	
	@Test(priority=1)
	public void add()
	{
		System.out.println("addition");
	}
	@Test
	public void sub()
	{
		System.out.println("subtraction");
	}
	@Test(priority=-1)
	public void multiply()
	{
		System.out.println("multiply");
	}
	@Test
	public void division()
    
	{
		System.out.println("div");
	}

}
