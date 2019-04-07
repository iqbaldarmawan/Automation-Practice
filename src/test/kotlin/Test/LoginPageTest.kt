package Test

import org.junit.Test
import sorabelTest.Page.HomePage
import sorabelTest.Test.BasePageTestWeb

class LoginPageTest : BasePageTestWeb() {


    @Test
    fun userShouldBeAbleToLogIn_LP_01() {
        HomePage(driver)
            .clickSignInBtnForLogin()
            .checkLoginPageIsDisplayed()
            .clickEmailAddreFIeld()
            .inputEmailAddreFIeld("RaKS8AuR0m@gmaill.com")
            .clickPasswordField()
            .inputPasswordField("12345")
            .clickSubmitLogin()
            .checkProfilePageIsDisplayed()
    }

    @Test
    fun verifythatUserIsNotAbleToLoginWithInputWrongEmail_LP_02() {
        HomePage(driver)
            .clickSignInBtnForLogin()
            .checkLoginPageIsDisplayed()
            .clickEmailAddreFIeld()
            .inputEmailAddreFIeld("123@gmaill.com")
            .clickPasswordField()
            .inputPasswordField("12345")
            .clickSubmitLogin()
            .checkErrorMessageIsDisplayed("Authentication failed.")
    }

    @Test
    fun verifythatUserIsNotAbleToLoginWithInputWrongPassowrd_LP_03() {
        HomePage(driver)
            .clickSignInBtnForLogin()
            .checkLoginPageIsDisplayed()
            .clickEmailAddreFIeld()
            .inputEmailAddreFIeld("RaKS8AuR0m@gmaill.com")
            .clickPasswordField()
            .inputPasswordField("123")
            .clickSubmitLogin()
            .checkErrorMessageIsDisplayed("Invalid password.")
    }

    @Test
    fun verifythatUserIsNotAbleToLoginWithInputWrongFormatEmail_LP_04() {
        HomePage(driver)
            .clickSignInBtnForLogin()
            .checkLoginPageIsDisplayed()
            .clickEmailAddreFIeld()
            .inputEmailAddreFIeld("aqwqw")
            .clickPasswordField()
            .inputPasswordField("12345")
            .clickSubmitLogin()
            .checkErrorMessageIsDisplayed("Invalid email address.")
    }

    @Test
    fun verifythatUserIsNotAbleToLoginWithInvalidUsernameAndInvalidPassword_LP_05() {
        HomePage(driver)
            .clickSignInBtnForLogin()
            .checkLoginPageIsDisplayed()
            .clickEmailAddreFIeld()
            .inputEmailAddreFIeld("aqwqw@gmail.com")
            .clickPasswordField()
            .inputPasswordField("12364646")
            .clickSubmitLogin()
            .checkErrorMessageIsDisplayed("Authentication failed.")
    }

    @Test
    fun verifythatUserIsNotAbleToLoginWithBlankUsernameAndPassword_LP_06() {
        HomePage(driver)
            .clickSignInBtnForLogin()
            .checkLoginPageIsDisplayed()
            .clickSubmitLogin()
            .checkErrorMessageIsDisplayed("An email address required.")
    }

    @Test
    fun verifythatUserIsNotAbleToLoginWithBlankUsername_LP_07() {
        HomePage(driver)
            .clickSignInBtnForLogin()
            .checkLoginPageIsDisplayed()
            .clickPasswordField()
            .inputPasswordField("12364646")
            .clickSubmitLogin()
            .checkErrorMessageIsDisplayed("An email address required.")
    }

    @Test
    fun verifythatUserIsNotAbleToLoginWithBlankPassword_LP_08() {
        HomePage(driver)
            .clickSignInBtnForLogin()
            .checkLoginPageIsDisplayed()
            .clickEmailAddreFIeld()
            .inputEmailAddreFIeld("RaKS8AuR0m@gmaill.com")
            .clickSubmitLogin()
            .checkErrorMessageIsDisplayed("Password is required.")
    }
}