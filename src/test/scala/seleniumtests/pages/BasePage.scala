package seleniumtests.pages

import org.scalatest.selenium.WebBrowser
import seleniumtests.utils.{Environment ⇒ Env, _}

trait BasePage extends Driver with WebBrowser{
  val url = ""
  def navigateTo():Unit = go to s"${Env.domain}/$url"

}
