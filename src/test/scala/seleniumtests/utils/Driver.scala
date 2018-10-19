package seleniumtests.utils

import org.openqa.selenium.WebDriver

trait Driver {
  implicit val driver: WebDriver = DriverInstance.getInstance().get
}
