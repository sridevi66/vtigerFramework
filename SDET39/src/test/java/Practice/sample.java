package Practice;

import org.testng.annotations.Test;

public class sample {

	@Test
	
		public void createContact()
		{
			System.out.println("contact created");
			int[] arr= {1,2,3};
			System.out.println(arr[5]);
		}
	
	
@Test
//(dependsOnMethods="createContact")
public void modify()
{
	System.out.println("contact modified");
}

@Test(dependsOnMethods="modify")
public void delete()
{
	System.out.println("contact deleted");
	
}
}


