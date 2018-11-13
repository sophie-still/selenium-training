package seleniumtests.stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import seleniumtests.pages.AuthWizard

class AccountCreationSteps extends ScalaDsl with EN {
  Given("^A user is eligible for Help to Save$") {
    AuthWizard.navigateTo()
    AuthWizard.fillInAuthWizard("EL074635A")
  }

  When("""^they select to use their GG email$"""){ () =>

  }
  When("""^enter valid bank details$"""){ () =>

  }
  Then("""^they will see the (.*) page$"""){ () =>

  }
  When("""^they accept the T&C's and create an account$"""){ () =>

  }

}
