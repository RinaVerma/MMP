package Com.test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Hashmap {
	WebDriver driver;
	
	@Test
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	@Test
	static HashMap<String,String> login(){
		HashMap hash = new HashMap();
		hash.put("x", "Rina@rina123");
		hash.put("y", "tina@rina125");
		hash.put("z", "bina@rina126");
		hash.put("t", "zina@rina128");
		return hash;
		
	}
	

	@Test
		public boolean validation(){
		boolean result = true;
			String credential = login().get("x");
		String cre[]=credential.split("@");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(cre[0]);;
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(cre[1]);
		driver.findElement(By.name("login")).click();
	     Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
		
		if(driver.getTitle().equals("Sign-on: Mercury Tours")){
	    	 System.out.println("Test case Passed");
	    	 result = true;
	    	 }
	    else{
	    		 System.out.println("Test case Failed"); 
	    		 result = false;
	    	 }
	     driver.findElement(By.linkText("Home")).click();
		return result;
	     }

	}


