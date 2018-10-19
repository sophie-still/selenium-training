package seleniumtests.utils

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.safari.SafariDriver

object DriverInstance extends Driver {
  var currentDriver:Option[WebDriver] = None

  def getInstance():Option[WebDriver] = {
    if (currentDriver.isEmpty) {
      val driver = createInstance()
      currentDriver = Some(driver)
    }
    currentDriver
  }
def createInstance():WebDriver = {
  val browserType = Option(System.getProperty("browser")).getOrElse("chrome")
  browserType match {
    case "chrome" ⇒ new ChromeDriver()
    case "firefox" ⇒ new FirefoxDriver()
    case "explorer" ⇒ new InternetExplorerDriver()
    case "safari" ⇒ new SafariDriver()
  }
}
}
