package hw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TrelloTestBase {
    ChromeDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        return TrelloTestBase.isAlertPresent(wd);
    }

    public void submitCreateBoard() {
        wd.findElement(By.xpath("//div[5]/div/div[2]/div/div/div/form/input[3]")).click();
    }

    public void fillBoardCreationForm() {
        wd.findElement(By.id("boardNewTitle")).click();
        wd.findElement(By.id("boardNewTitle")).clear();
        wd.findElement(By.id("boardNewTitle")).sendKeys("NewBoard");
    }

    public void initCreateBoard() {
        //wd.findElement(By.linkText("Create Board… A board is made up of cards ordered on lists. Use it to manage projects, track information, or organize anything.")).click();
        wd.findElement(By.xpath("html/body/div[5]/div/div[2]/div/div/div/ul/li[1]/a")).click();
    }

    public void initCreate() {
        wd.findElement(By.xpath(".//*[@id='header']/div[4]/a[1]/span")).click();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void fillLogInForm() {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys("alabama.oksana@gmail.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("eggsoftrump");
        wd.findElement(By.id("login")).click();
    }

    public void initLogIn() {
        wd.findElement(By.xpath(".//*[@href='/login']")).click();
    }

    public void openSite() {
        wd.get("https://trello.com/");
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
