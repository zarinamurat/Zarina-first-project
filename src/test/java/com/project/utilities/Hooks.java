package com.project.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;


/**
 * @author Saule
 *
 * 
 */
public class Hooks extends CommonSteps {
	
	public void setup(){
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize() ;
	}
	
	@After
	public void tearDown(Scenario scenario){
		if(scenario.isFailed()){
			final byte[]screenshot=((TakesScreenshot)driver).getScreenshotAs(
					OutputType.BYTES);
			
			scenario.embed(screenshot, "image/png");
		}
		driver.quit();
	}
}
