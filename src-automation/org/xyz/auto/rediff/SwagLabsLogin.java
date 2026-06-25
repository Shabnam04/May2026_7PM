package org.xyz.auto.rediff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SwagLabsLogin {

	@Test
    public void loginpage()
    {

      
        // Launch browser
        WebDriver driver = new EdgeDriver();

        // Open Swag Labs application
        driver.get("https://www.saucedemo.com/");

        // Maximize browser
        driver.manage().window().maximize();

        // Find Username field and enter value
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        // Find Password field and enter value
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        // Click Login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

      List<WebElement> productlist =  driver.findElements(By.cssSelector("[class='inventory_item_name ']"));
      
      System.out.println(productlist.size());
      
      for(WebElement list: productlist )
      {
    	  System.out.println(list.getText());
      }
      
      productlist.get(1).click();
      
      
      
      
      
      
      
    
    }
}