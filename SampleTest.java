package com;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Hello program

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleTest {

	public static void main(String[] args) {

		// File file = new File(
		// "C:\\Users\\ADMIN\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.8.1\\selenium-chrome-driver-3.8.1.jar");
		File file1 = new File("C:\\Users\\ADMIN\\Desktop\\chrome driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file1.getAbsolutePath());
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your username:");
		String name = sc.next();
		if (name.equalsIgnoreCase("ulaganathan")) {

			WebDriver webDriver = new ChromeDriver();

			ChromeOptions options = new ChromeOptions();
			long statTime = System.currentTimeMillis();

			webDriver.get("https://www.gmail.com");

			// *[@id="identifierId"]
			// *[@id="passwordNext"]/div[2]

			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter your email id:");
			String usrName = sc1.next();
			webDriver.findElement(By.id("identifierId")).sendKeys("ulagan007@gmail.com");
			//webDriver.findElement(By.id("identifierId")).sendKeys(usrName);
			webDriver.findElement(By.id("identifierNext")).click();
			webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.HOURS);

			webDriver.findElement(By.name("password")).sendKeys("Ug@dec2017");

			webDriver.findElement(By.id("passwordNext")).click();
			webDriver.quit();
			long endTime = System.currentTimeMillis();

			long totalTime = endTime - statTime;
			long hours = TimeUnit.MILLISECONDS.toHours(totalTime);
			long minutes = TimeUnit.MILLISECONDS.toMinutes(totalTime);
			long seconds = TimeUnit.MILLISECONDS.toSeconds(totalTime);
			System.out.println("hours :" + hours + "minutes :" + minutes + "Seconds :" + seconds);
		} else {
			System.out.println("the name you entered is wrong. Please check the user name");
		}

	}

}
