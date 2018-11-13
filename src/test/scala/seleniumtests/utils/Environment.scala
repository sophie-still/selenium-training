package seleniumtests.utils

object Environment {

  val domain: String = {
    val env = getEnvironment
    env match {
      case "local" ⇒ "http://localhost:9949"
      case "qa" ⇒ "https://www.qa.tax.service.gov.uk"
      case "et" ⇒ "https://test-www.tax.service.gov.uk"
      case "staging" ⇒ "https://www.staging.tax.service.gov.uk"
      case _ ⇒ throw new NullPointerException("Environment type not recognised")
    }
  }

  //brackets not required for a 'get' definition
  def getEnvironment:String = Option(System.getProperty("env")).getOrElse("local")
}
