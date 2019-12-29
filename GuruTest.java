package com.Expt.mavenProj.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GuruTest {
	@Test
	public static void testDemo() {

WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://demo.guru99.com/test/delete_customer.php");
	}


}
