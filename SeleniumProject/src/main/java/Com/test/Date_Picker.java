package Com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker {

	public static void main(String[] args) {
		//"http://cleartrip.com"
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String month_year = "May 2020";
		String day = "25";	  
		driver.get("https://www.expedia.com/");
		driver.findElement(By.xpath("//*[@id='tab-hotel-tab-hp']")).click();
		driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']")).click();
		//String text = driver.findElement(By.xpath("//caption[@class='datepicker-cal-month-header']")).getText();
		//System.out.println(text);
		while(true){
			String text = driver.findElement(By.xpath("//caption[@class='datepicker-cal-month-header']")).getText();
		if(text.equals(month_year)){
			break;
		}else{
		
			driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/button[2]")).click();
		}}
	List <WebElement> days =	driver.findElements(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/div[2]/table/tbody/tr/td/button"));
		
		for(WebElement ele : days){
			System.out.println(ele);
		}
		
		
		}

}
