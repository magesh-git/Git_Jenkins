package org.nopcommerce;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPagePOM extends BaseClass{
	
	AddToCartPagePOM(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='product-item']")
	private List<WebElement> products;
	@FindBy(xpath="//button[@type='button']")
	private WebElement addToCartButton;

	public List<WebElement> getProducts() {
		return products;
	}
	
	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void AddToCartPagePOMOperations(){
		List<WebElement> products2 = getProducts();
		WebElement addToCartButton2 = getAddToCartButton();
		
		for(WebElement ele:products2) {
			String text = getText(ele);
			if (text.contains("HP")) {
				click(ele);
				click(addToCartButton2);
			}
		}
		System.out.print("Execution is passed");
	}

}
