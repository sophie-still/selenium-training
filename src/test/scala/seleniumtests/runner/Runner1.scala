package seleniumtests.runner

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue     = Array("seleniumtests.stepdefs"),
  plugin   = Array("pretty", "html:target/cucumber", "json:target/cucumber.json"),
  tags     = Array("~@ignore")
)
class Runner1 {

}
