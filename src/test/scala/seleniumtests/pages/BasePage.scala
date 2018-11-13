package seleniumtests.pages

import org.scalatest.selenium.WebBrowser
import seleniumtests.utils.{Environment ⇒ Env, _}

trait BasePage extends Driver with WebBrowser {
  val url = ""
  def navigateTo():Unit = go to s"${Env.domain}/$url"
  def clickButton(buttonName:String):Unit =
    buttonName match {
      case "submit" ⇒ click on find(cssSelector("input[type='submit']")).get
    }

}
