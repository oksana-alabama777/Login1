package hw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TrelloLogin {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    @Test
    public void TrelloLogin() {
        openSite();
        //wd.findElement(By.linkText("Войти")).click();
        wd.findElement(By.xpath(".//*[@href=\"/login?returnUrl=%2F\"]"));
        /*wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys("alabama.oksana@gmail.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("eggsoftrump");
        wd.findElement(By.id("login")).click();
        wd.findElement(By.xpath("//div[@class='header-user']/a[1]/span")).click();
        wd.findElement(By.linkText("Create Board… A board is made up of cards ordered on lists. Use it to manage projects, track information, or organize anything.")).click();
        wd.findElement(By.id("boardNewTitle")).click();
        wd.findElement(By.id("boardNewTitle")).clear();
        wd.findElement(By.id("boardNewTitle")).sendKeys("NewBoard");
        wd.findElement(By.xpath("//div[5]/div/div[2]/div/div/div/form/input[3]")).click();*/
    }

    private void openSite() {
        wd.get("https://trello.com/");
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
