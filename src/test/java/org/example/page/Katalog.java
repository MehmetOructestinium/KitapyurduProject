package org.example.page;

import org.example.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.example.driver.BaseTest.driver;

public class Katalog {
    Methods methods = new Methods();
    public void random() {
        Random random = new Random();
        List<WebElement> links = driver.findElements(By.cssSelector(".pr-img-link"));
        int value = links.size();
        links.get(random.nextInt(value)).click();
        methods.waitBySeconds(2);
    }

}
