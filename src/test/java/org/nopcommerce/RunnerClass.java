package org.nopcommerce;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RunnerClass extends BaseClass{
   
	@BeforeClass
	public void launch() throws IOException {
		browserLaunch();
	}
	
	@Test
	public void execution() throws IOException, InterruptedException {
		waits();
		LoginPagePOM lop= new LoginPagePOM();
		lop.LoginPagePOMOpearations();
		ProductPagePOM ppo=new ProductPagePOM();
		ppo.ProductPagePOMOperations();
		AddToCartPagePOM atc= new AddToCartPagePOM();
		atc.AddToCartPagePOMOperations();
	}
	
	
}
