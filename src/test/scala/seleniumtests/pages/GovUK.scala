package seleniumtests.pages

import org.openqa.selenium.WebDriver

object GovUK extends BasePage {
  def goToGovUK() = driver.navigate().to("https://www.gov.uk")
}
