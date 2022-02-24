package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class HomeNew extends Base {
	
		
		
		public HomeNew() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
		private WebElement textToValidate;
		
		public void homePageValidate() throws IOException {
			String text = textToValidate.getText();
			if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
				logger.info("'" + textToValidate + "'" + "text verified");
			}else {
				logger.info("'" + textToValidate + "'" + "text not verified");
			}
			Utilities.highlightelementRedBorder(textToValidate);
			Utilities.takeScreenShot("Homepage");
		}

		
		@FindBy(xpath = "//div[@class='btn-group']//button[@class='btn btn-link dropdown-toggle']")
		private WebElement currency;
		public void clickOnCurrencyButton() {
			currency.click();
		
		}

		@FindBy(xpath = "//button[text()='€ Euro']")
		private WebElement euro;
		public void clickOnEuro() {
			euro.click();
			
		}
		
		
		@FindBy(xpath = "//strong[text()='€']")
		private WebElement eurocurrency;
		public void verifyEuro() throws IOException {
			eurocurrency.getText();
			Utilities.highlightelementRedBorder(eurocurrency);
			Utilities.takeScreenShot("EuroCurrencySign");
			
		}
		
		
		@FindBy(xpath = "//span[@id='cart-total']")
		private WebElement shoppingcart;
		public void clickOnshoppingcart() {
			shoppingcart.click();
			


		}
		
		@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
		private WebElement shoppingCartMessage;
		
		
		public void displyEmptyShoppingCartMessage() throws IOException {
//			shoppingCartMessage.getText();
//			Utilities.highlightelementRedBorder(shoppingCartMessage);
//			Utilities.takeScreenShot("EmptyshoppingCartMessage");	
			
			String expectedMssg = "Your shopping cart is empty!";
			String actualMessage = shoppingCartMessage.getText();
			try {
				Assert.assertEquals(expectedMssg, actualMessage);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Utilities.highlightelementRedBorder(shoppingCartMessage);
			Utilities.takeScreenShot("shopping Cart empty Text");

		
			
		}

		
//		@FindBy(xpath = "")
//		private WebElement PoweredBy;
//		public boolean euroCurrencyIsDisplayed() {
//			if (eurocurrency.isDisplayed()) {
//				return true; 
//			} else {
//				return false; 
//			}
//		}
//		public boolean isShoppingCartEmptyMessageDisplayed() {
//			if (shoppingcart.isDisplayed()) {
//				return true;
//			} else {
//				return false; 
//			}
//		}
			
		}


