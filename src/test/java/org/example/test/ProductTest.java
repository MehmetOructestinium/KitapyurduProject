package org.example.test;

import org.example.driver.BaseTest;
import org.example.page.LoginPage;
import org.example.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {
    @Test
    public void productTest(){
        LoginPage loginPage =new LoginPage();
        ProductPage productPage = new ProductPage();
        loginPage.login();
        productPage.selectProduct();
    }
    @Test
    public void getAttributeTest(){
        ProductPage productPage =new ProductPage();
        productPage.attributeTest();
    }
    @Test
    public void getTextTest(){
        LoginPage loginPage =new LoginPage();
        ProductPage productPage = new ProductPage();
        loginPage.login();
        productPage.textControl();
    }

}
