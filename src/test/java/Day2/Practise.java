package Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
    WebDriver driver;
    @Before
    public void init(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void test1(){
        driver.get("https://www.google.de/?hl=de");

        WebElement gLink = driver.findElement(By.linkText("Gmail"));
        WebElement gPLink = driver.findElement(By.partialLinkText("Gm"));
        System.out.println(gLink.getText());
        System.out.println(gPLink.getText());
        WebElement TextArea = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
        System.out.println(TextArea.getTagName());


        driver.close();


    }

    @Test
    public void test2(){
        driver.get("https://www.google.de/?hl=de");
        WebElement TextArea = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        System.out.println(TextArea.getTagName());
        driver.close();
    }
    @Test
    public void test3(){
        driver.get("https://www.w3schools.com/");
        WebElement learnText = driver.findElement(By.xpath("//h1[.='Learn to Code']"));
        WebElement learnCssText = driver.findElement(By.cssSelector("h1.learntocodeh1"));
        System.out.println(learnCssText.getText());
        System.out.println(learnText.getText());
    }
    @After
    public void after(){
        driver.close();
    }
}