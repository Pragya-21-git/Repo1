package package3Test;

import org.testng.annotations.Test;

public class Class3Test {

	@Test
	public void thirdTest() {
		
				System.out.println(System.getProperty("url"));
				System.out.println(System.getProperty("browser"));
				System.out.println(System.getProperty("username"));
				System.out.println(System.getProperty("password"));
	}
}
