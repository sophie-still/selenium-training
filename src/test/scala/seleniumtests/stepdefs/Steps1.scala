package seleniumtests.stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import seleniumtests.pages.AuthWizard

class Steps1 extends ScalaDsl with EN {
  Given ("^I go to gov.uk page$") {
    AuthWizard.navigateTo()
  }
}
