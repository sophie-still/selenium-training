package seleniumtests.stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import seleniumtests.pages.GovUK

class Steps1 extends ScalaDsl with EN {
  Given ("^I go to gov.uk page$") {
    GovUK.goToGovUK()
  }
}
