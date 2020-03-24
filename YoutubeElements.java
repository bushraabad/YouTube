package YouTube;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeElements {
	//menu icon elements in contracted form
	
	private static WebElement element = null;	
	public static WebElement menu_icon (WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='guide-icon']")); 
		//html//yt-icon-button[@id='guide-button']/button[@id='button']
		return element;
}
		private static WebElement element1 = null;	
		public static WebElement home_coll (WebDriver driver){
			element = driver.findElement(By.xpath("//*[@id=\"items\"]/ytd-mini-guide-entry-renderer[1]")); 
			//html[1]/body[1]/ytd-app[1]/div[1]/ytd-mini-guide-renderer[1]/div[1]/ytd-mini-guide-entry-renderer[1]/a[1]
					//html/body/ytd-app/div/ytd-mini-guide-renderer/div/ytd-mini-guide-entry-renderer[1]
							//*[@id="items"]/ytd-mini-guide-entry-renderer[1]
			return element;
	}
		private static WebElement element2 = null;	
		public static WebElement trending_coll (WebDriver driver){
			element = driver.findElement(By.xpath("/html//div[@id='items']/ytd-mini-guide-entry-renderer[2]")); 
			return element;
	}
		private static WebElement element3 = null;	
		public static WebElement subs_coll (WebDriver driver){
			element = driver.findElement(By.xpath("/html//div[@id='items']/ytd-mini-guide-entry-renderer[3]")); 
			return element;
	}
		private static WebElement element4 = null;	
		public static WebElement library_coll (WebDriver driver){
			element = driver.findElement(By.xpath("/html//div[@id='items']/ytd-mini-guide-entry-renderer[4]")); 
			return element;
	}
		private static WebElement element5 = null;	
		public static WebElement history_coll (WebDriver driver){
			element = driver.findElement(By.xpath("/html//div[@id='items']/ytd-mini-guide-entry-renderer[5]")); 
			return element;
	}
		private static WebElement element6 = null;	
		public static WebElement yt_logo (WebDriver driver){
			element = driver.findElement(By.xpath("//div[@id='logo-icon-container']")); 
			return element;
		}
		//menu icon elements in expanded form
		private static WebElement element7 = null;	
		public static WebElement home_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Home')]/ancestor::paper-item")); 
			return element;
		}
		private static WebElement element8 = null;	
		public static WebElement trending_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Trending')]/ancestor::paper-item")); 
			return element;
		}
		private static WebElement element9 = null;	
		public static WebElement sub_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Subscriptions')]/ancestor::paper-item")); 
			return element;
		}
		private static WebElement element10 = null;	
		public static WebElement lib_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Library')]/ancestor::paper-item")); 
			return element;
		}
		private static WebElement element11 = null;	
		public static WebElement history_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'History')]/ancestor::paper-item")); 
			return element;
		}	
		private static WebElement element12 = null;	
		public static WebElement music_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Music')]/ancestor::paper-item")); 
			return element;
		}
		private static WebElement element13 = null;	
		public static WebElement sports_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Sports')]/ancestor::paper-item[1]")); 
			return element;
		}
		private static WebElement element14 = null;	
		public static WebElement gaming_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Gaming')]/ancestor::paper-item")); 
			return element;
	}
		private static WebElement element15 = null;	
		public static WebElement news_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'News')]/ancestor::paper-item[1]")); 
			return element;
	}
		private static WebElement element16 = null;	
		public static WebElement live_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Live')]/ancestor::paper-item[1]")); 
			return element;
	}
		private static WebElement element17 = null;	
		public static WebElement video_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'360° Video')]/ancestor::paper-item[1]")); 
			return element;
	}
		private static WebElement element18 = null;	
		public static WebElement browse_ch_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Browse channels')]/ancestor::paper-item")); 
			return element;
	}
		private static WebElement element19 = null;	
		public static WebElement LIVE_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Live')]/ancestor::paper-item")); 
			return element;
	}
		private static WebElement element20 = null;	
		public static WebElement settings_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Settings')]/ancestor::paper-item")); 
			return element;
	}
		private static WebElement element21 = null;	
		public static WebElement report_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Report history')]/ancestor::paper-item[1]")); 
			return element;
	}
		private static WebElement element22 = null;	
		public static WebElement send_fb_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Send feedback')]/ancestor::paper-item")); 
			return element;
	}
		private static WebElement element23 = null;	
		public static WebElement help_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//text()[contains(.,'Help')]/ancestor::paper-item")); 
			return element;
	}
		//menu icon in expanded form footer elements
		private static WebElement element24 = null;	
		public static WebElement about_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//a[text()='About']")); 
			return element;
	}
		private static WebElement element25 = null;	
		public static WebElement press_exp (WebDriver driver){
			element = driver.findElement(By.xpath("/a[text()='Press']")); 
			return element;
	}
		private static WebElement element26 = null;	
		public static WebElement copyright_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//a[text()='Copyright']")); 
			return element;
	}
		private static WebElement element27 = null;	
		public static WebElement contact_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//a[text()='Contact us']")); 
			return element;
	}
		private static WebElement element28 = null;	
		public static WebElement creators_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//a[text()='Creators']")); 
			return element;
	}
		private static WebElement element29 = null;	
		public static WebElement avertise_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//a[text()='Advertise']")); 
			return element;
	}
		private static WebElement element30 = null;	
		public static WebElement developers_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//a[text()='Developers']")); 
			return element;
	}
		private static WebElement element31 = null;	
		public static WebElement terms_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//a[text()='Terms']")); 
			return element;
	}
		private static WebElement element32 = null;	
		public static WebElement privacy_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//a[text()='Privacy']")); 
			return element;
	}
		private static WebElement element33 = null;	
		public static WebElement policy_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//a[text()='Policy & Safety']")); 
			return element;
	}
		private static WebElement element34 = null;	
		public static WebElement testnew_exp (WebDriver driver){
			element = driver.findElement(By.xpath("//a[text()='Test new features']")); 
			return element;
	}

}











