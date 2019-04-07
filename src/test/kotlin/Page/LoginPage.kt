package Page

import org.openqa.selenium.WebDriver
import sorabelTest.Page.BasePageWeb

class LoginPage(driver: WebDriver) : BasePageWeb(driver) {

    fun checkLoginPageIsDisplayed(): LoginPage {
        assertTitlePageIsEquals("Login - My Store")
        return this
    }

    fun clickEmailAddreFIeld() : LoginPage{
        clickElementById("email")
        return this
    }

    fun inputEmailAddreFIeld(email : String) : LoginPage{
        inputElementByCssSelector("input#email", email)
        return this
    }

    fun clickPasswordField() : LoginPage{
        clickElementById("passwd")
        return this
    }

    fun inputPasswordField(password : String) : LoginPage{
        inputElementByCssSelector("input#passwd", password)
        return this
    }

    fun clickSubmitLogin(): LoginPage{
        clickElementById("SubmitLogin")
        return this
    }

    fun checkProfilePageIsDisplayed() :LoginPage{
        assertElementIsDisplayedByCssSelector("div#center_column > h1")
        return this
    }

    fun checkErrorMessageIsDisplayed(errorMessage : String) :LoginPage{
        assertTextElementIsEqualsByCssSelector("div#center_column li",errorMessage)
        return this
    }
}