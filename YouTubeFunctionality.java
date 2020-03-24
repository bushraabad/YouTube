package YouTube;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import xpath.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubeFunctionality {

	public static void main (String [] args) throws IOException, InterruptedException{
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();	 
		        String baseUrl = "https://www.youtube.com/";
		        String actualTitle = "";
		        driver.get(baseUrl);	     
		       Thread.sleep(3000);	
		       //Testing menu -icon in collapsed state
		       YoutubeElements.menu_icon(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.trending_coll(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.home_coll(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.subs_coll(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.history_coll(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.library_coll(driver).click();
		       Thread.sleep(1000);
		       System.out.println("Testing menu-icon elements in collapsed state is successful");
		     //Testing menu -icon in expanded state
		       YoutubeElements.yt_logo(driver).click();
		       Thread.sleep(1000); 
		       YoutubeElements.menu_icon(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.trending_exp(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.sub_exp(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.home_exp(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.lib_exp(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.history_exp(driver).click();
		       Thread.sleep(1000);
		      // YoutubeElements.music_exp(driver).click();
		      // Thread.sleep(6000);
		       YoutubeElements.sports_exp(driver).click();
		       Thread.sleep(6000);		       		    
		       YoutubeElements.gaming_exp(driver).click();
		       Thread.sleep(6000);
		       YoutubeElements.news_exp(driver).click();
		       Thread.sleep(6000);
		       YoutubeElements.live_exp(driver).click();
		       Thread.sleep(6000);
		       YoutubeElements.video_exp(driver).click();
		       Thread.sleep(6000);
		       YoutubeElements.browse_ch_exp(driver).click();
		       Thread.sleep(6000);
		       	      
		       YoutubeElements.settings_exp(driver).click();
		       Thread.sleep(3000);
		       driver.get(baseUrl);	     
		       Thread.sleep(3000);
		       
		       YoutubeElements.report_exp(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.help_exp(driver).click();
		       Thread.sleep(1000);
		       YoutubeElements.send_fb_exp(driver).click();
		       Thread.sleep(1000); 
		       System.out.println("Testing menu-icon elements in expanded state is successful");
		       
		       YoutubeElements.about_exp(driver).click();
		       Thread.sleep(2000);
		       driver.get(baseUrl);	     
		       Thread.sleep(2000);
		       //scroll menu bar
		       YoutubeElements.press_exp(driver).click();
		       Thread.sleep(2000);
		       driver.get(baseUrl);	     
		       Thread.sleep(2000);
		       System.out.println("Testing menu-icon footer elements in expanded state is successful");
}
	
}
