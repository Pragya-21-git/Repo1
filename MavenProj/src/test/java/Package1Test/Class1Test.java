package Package1Test;

import org.testng.annotations.Test;

public class Class1Test {

	@Test
	public void firstTest() {
		
				System.out.println(System.getProperty("url"));
				System.out.println(System.getProperty("browser"));
				System.out.println(System.getProperty("username"));
				System.out.println(System.getProperty("password"));
	}
}

