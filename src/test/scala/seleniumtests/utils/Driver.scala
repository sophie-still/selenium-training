package seleniumtests.utils

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

trait Driver {
implicit val driver: WebDriver = new ChromeDriver()
}
