package org.example.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.example.driver.BaseTest.driver;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);
    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKeys(By.cssSelector("input[id='search-input']"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.xpath("(//*[@class='add-to-favorites'])[7]"));
        methods.waitBySeconds(2);
        for (int i = 6; i < 10; i++) {
            methods.click(By.xpath("(//*[@class='fa fa-heart'])" + "[" + i + "]"));
            methods.waitBySeconds(1);
            logger.info("4 ürün başarılı bir şekilde favorilere eklendi");
        }
        methods.waitBySeconds(6);
        methods.findElement(By.xpath("//*[@id='header-bottom']//div[@class='logo-text']")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//*[@class='lvl1catalog']")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//*[@title='Puan Kataloğundaki Türk Klasikleri']")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//*[@class='sort']//select//option[contains(text(),\"Yüksek Oylama\")]")).click();
        methods.waitBySeconds(2);
        methods.hoverElement(By.xpath("(//*[contains(text(),\"Tüm Kitaplar\")])[3]"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//a[contains(@href, 'kategori/kitap-hobi/1_212.html')]")).click();
        methods.waitBySeconds(2);
        methods.hoverElement(By.xpath("//div[@class=\"menu top my-list\"]//a[@class=\"common-sprite\"]"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//a[contains(@href, 'https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0')]")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("(//*[@class=\"fa fa-heart-o\"])[3]\n")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("#cart-items")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("#js-cart")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("[name=\"quantity\"]")).clear();
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector("[name=\"quantity\"]")).sendKeys("3");
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//*[@class=\"fa fa-refresh green-icon\"] ")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector(".right>a")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//a[contains(@href, '#tab-shipping-new-adress')]\t")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"firstname_companyname\"]")).sendKeys("Mehmet");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"lastname_title\"]")).sendKeys("Oruc");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("[name=\"zone_id\"]"), "Ankara");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("[name=\"county_id\"]"), "EVREN");
        methods.findElement(By.cssSelector("[name=\"district\"]")).sendKeys("goksu mah. ");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"address\"]")).sendKeys("dere sk. no 45");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"postcode\"]")).sendKeys("06040");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"telephone\"]")).sendKeys("5398259258");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"mobile_telephone\"]")).sendKeys("5398259258");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"tax_id\"]")).sendKeys("19966090178");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector(".button>i")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector("[name=\"credit_card_owner\"]")).sendKeys("Mehmet Oruc");
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector("[name=\"credit_card_number_1\"]")).sendKeys("2243");
        methods.findElement(By.cssSelector("[name=\"credit_card_number_2\"]")).sendKeys("2345");
        methods.findElement(By.cssSelector("[name=\"credit_card_number_3\"]")).sendKeys("2354");
        methods.findElement(By.cssSelector("[name=\"credit_card_number_4\"]")).sendKeys("1234");
        methods.selectByText(By.cssSelector("[name=\"credit_card_expire_date_month\"]"),"01");
        methods.selectByText(By.cssSelector("[name=\"credit_card_expire_date_year\"]"),"2265");
        methods.selectByText(By.cssSelector("[name=\"credit_card_security_code\"]"),"332");
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector(".button>i")).click();
    }
    public void attributeTest() {
        String attribute = methods.gettAttribute(By.cssSelector(".logo-text>a>img"), "tittle");
        System.out.println("alınann text :" + attribute);
        logger.info("Alınan text : " + attribute);
        methods.waitBySeconds(2);
    }
    public void textControl() {
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("alınan text : " + text);
        logger.info("alınan text : " + text);
    }

    public void selectRandom() {
        methods.click(By.xpath("(//*[@class='mn-strong common-sprite'])[3]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='mn-icon icon-angleRight'])[49]"));
        methods.waitBySeconds(2);
        random();
        methods.waitBySeconds(2);
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(2);
    }

    public void random() {
        Random random = new Random();
        List<WebElement> links = driver.findElements(By.cssSelector(".pr-img-link"));
        int value = links.size();
        links.get(random.nextInt(value)).click();
        methods.waitBySeconds(2);
    }



}
