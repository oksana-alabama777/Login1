package hw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TrelloCreateBoard extends TrelloTestBase {

    @Test
    public void TrelloLogin() {
        openSite();
        initLogIn();
        fillLogInForm();
        initCreate();
        initCreateBoard();
        fillBoardCreationForm();
        submitCreateBoard();
    }

}
