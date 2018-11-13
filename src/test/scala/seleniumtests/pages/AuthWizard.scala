package seleniumtests.pages

import seleniumtests.utils.Environment


object AuthWizard extends BasePage {
  override val url = "auth-login-stub/gg-sign-in"

  def fillInAuthWizard(nino: String): Unit = {

    find(cssSelector("input[name='redirectionUrl']")).get.underlying.sendKeys(s"$env/help-to-save/check-eligibility")
    singleSel("credentialStrength").value = "strong"
    singleSel("confidenceLevel").value = "200"
    find(cssSelector("input[name='email']")).get.underlying.clear()
    find(cssSelector("input[name='email']")).get.underlying.sendKeys("sophie.still@digital.hmrc.gov.uk")
    find(cssSelector("input[name='nino']")).get.underlying.sendKeys(s"$nino")
    find(cssSelector("input[name='itmp.givenName']")).get.underlying.sendKeys("Sophie")
    find(cssSelector("input[name='itmp.middleName']")).get.underlying.sendKeys("Grace")
    find(cssSelector("input[name='itmp.familyName']")).get.underlying.sendKeys("Clark")
    find(cssSelector("input[name='itmp.dateOfBirth']")).get.underlying.sendKeys("1987-03-04")
    find(cssSelector("input[name='itmp.address.line1']")).get.underlying.sendKeys("Address line 1")
    find(cssSelector("input[name='itmp.address.line2']")).get.underlying.sendKeys("Address line 2")
    find(cssSelector("input[name='itmp.address.line3']")).get.underlying.sendKeys("Address line 3")
    find(cssSelector("input[name='itmp.address.line4']")).get.underlying.sendKeys("Address line 4")
    find(cssSelector("input[name='itmp.address.line5']")).get.underlying.sendKeys("Address line 5")
    find(cssSelector("input[name='itmp.address.postCode']")).get.underlying.sendKeys("BN11 4LJ")
    find(cssSelector("input[name='itmp.address.countryName']")).get.underlying.sendKeys("United Kingdom")
    find(cssSelector("input[name='itmp.address.countryCode']")).get.underlying.sendKeys("GB")
    clickButton("submit")
  }

  // lazy val is only found when the line calling it is processed. Lazy means it can't be assigned in advance
  lazy val env: String = if (Environment.getEnvironment == "local") "http://localhost:7000" else ""
}