package QABootcamp_Maven.AxsosAcademy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
        // 1 Setup Chrome driver
        WebDriver driver = new ChromeDriver();
        // 2 Launch the login page
        driver.get("https://the-internet.herokuapp.com/login");

        // 3 Find the web element by the attribute name 
        WebElement usernameField = driver.findElement(By.name("username"));

        System.out.println("element by name 'username' is located");
        // time to observe the output
        Thread.sleep(3000);
        
        // 4 Close browser
        driver.quit();
    }
}
