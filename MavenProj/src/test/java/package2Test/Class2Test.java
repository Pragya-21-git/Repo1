package package2Test;

import org.testng.annotations.Test;

public class Class2Test {

	@Test
	public void secondTest() {
		
				System.out.println(System.getProperty("url"));
				System.out.println(System.getProperty("browser"));
				System.out.println(System.getProperty("username"));
				System.out.println(System.getProperty("password"));
	}
}
