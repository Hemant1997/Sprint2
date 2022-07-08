package com.magicbricks.utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class ScreenShot {
	
	public static void captureScreenShot99(WebDriver driver1) throws IOException{
		//Take screenshot and store as a file format 
		File src=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		try {
		// now copy the screenshot to desired location using copyFile method
		File Dest=new File("C:\\Screenshots"+timestamp()+" "+ "google_seema_search_box.png");
		//FileUtils.copyFile(src, new File("C:\\driver9999\\screenshot\\"+timestamp()+" "+ "google_search_box.png"));
		FileUtils.copyFile(src, Dest);
		}
		catch (IOException e)
		{
		System.out.println(e.getMessage()) ;
		}
		}
		public static String timestamp() {
		//yyyy-MM-dd HH-mm-ss
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		//return new SimpleDateFormat("MM-dd-yyyy").format(new Date());
		}

	
}
