package org.nopcommerce;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPagePOM extends BaseClass{
	ProductPagePOM(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="small-searchterms")
	private WebElement searchBox;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	@FindBy(id="advs")
	private WebElement advanceSearch;
	@FindBy(id="cid")
	private WebElement category;
	@FindBy(id="isc")
	private WebElement subCategories;
	@FindBy(id="mid")
	private WebElement manufacturer;
	@FindBy(id="sid")
	private WebElement descriptions;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement finalsearch;
	
	public WebElement getSearchBox() {
		return searchBox;
	}
	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}
	public WebElement getAdvanceSearch() {
		return advanceSearch;
	}
	public void setAdvanceSearch(WebElement advanceSearch) {
		this.advanceSearch = advanceSearch;
	}
	public WebElement getCategory() {
		return category;
	}
	public void setCategory(WebElement category) {
		this.category = category;
	}
	public WebElement getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(WebElement subCategories) {
		this.subCategories = subCategories;
	}
	public WebElement getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(WebElement manufacturer) {
		this.manufacturer = manufacturer;
	}
	public WebElement getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(WebElement descriptions) {
		this.descriptions = descriptions;
	}
	public WebElement getFinalsearch() {
		return finalsearch;
	}
	public void setFinalsearch(WebElement finalsearch) {
		this.finalsearch = finalsearch;
	}
	
	public void ProductPagePOMOperations() throws IOException {
		WebElement searchBox2 = getSearchBox();
		sendKeys(searchBox2, excelRead(7,1));
		WebElement searchButton2 = getSearchButton();
		click(searchButton2);
		WebElement advanceSearch2 = getAdvanceSearch();
		click(advanceSearch2);
		WebElement category2 = getCategory();
		select(category2, excelRead(8,1));
		WebElement subCategories2 = getSubCategories();
		click(subCategories2);
		WebElement manufacturer2 = getManufacturer();
		select(manufacturer2, excelRead(9,1));
		WebElement descriptions2 = getDescriptions();
		click(descriptions2);
		WebElement finalsearch2 = getFinalsearch();
		click(finalsearch2);
	}
	
}
