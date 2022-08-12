package comcast.vtiger.generalutility;

import java.util.Random;

public class javaUtility {
	
	public int getRandomNumber(){
		Random ran =new Random();
		int ranNum=ran.nextInt(1000);
return ranNum;
	}
}

//int ranNum=jlib.getRandomNumber();

//String proname=elib.getDataFromExcel("product",2,1)+ranNum;

