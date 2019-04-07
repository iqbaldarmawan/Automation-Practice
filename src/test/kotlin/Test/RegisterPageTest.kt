package sorabelTest.Test

import sorabelTest.Page.HomePage
import org.junit.Test

/**
 * Created by Iqbal Darmawan on 6/04/2019
 */

class RegisterPageTest : BasePageTestWeb() {

    @Test
    fun userShouldBeAbleToSignUp_RP_01() {
        HomePage(driver)
            .clickSignInBtnForRegister()
            .registerPageIsDisplayed()
            .inputEmailAddress()
            .clickCreateAnAccountBtn()
            .checkPersonalInformationPageIsDisplayed()
            .clickBtnMr()
            .inputFirstNamePersonalInfo("Iqbal")
            .inputLastNamePersonalInfo("Darmawan")
            .inputEmail()
            .inputPassword("12345")
            .selectDayOfrBirth("11")
            .selectMonthOfBirthd("November")
            .selectYearOfBirthd("1995")
            .inputFirstName("Iqbal")
            .inputLastName("Darmawan")
            .inputCompanyName("Sorabel")
            .inputAddress("Jkt")
            .inputAddressLine2("Jkt")
            .inputCity("Jakarta")
            .selectState("Idaho")
            .inputZip("12345")
            .selectCountry("United State")
            .inputAdditionalInfo("Test")
            .inputHomePhone()
            .inputMobilePhone()
            .inputAddressAlias("Jkt")
            .clickRegisterBtn()
    }

    @Test
    fun verifyThatUserIsNotAbleToSignUpWithInvalidEmailAddress_RP_02(){
        HomePage(driver)
            .clickSignInBtnForRegister()
            .registerPageIsDisplayed()
            .inputInvalidEmailAddress("zzzz")
            .clickCreateAnAccountBtn()
            .checkErrorMessageIsDIsplaye()
    }

    @Test
    fun verifyThatUserIsNotAbleToSignUpWithSameEmailAddress_RP_03(){
        HomePage(driver)
            .clickSignInBtnForRegister()
            .registerPageIsDisplayed()
            .inputInvalidEmailAddress("RaKS8AuR0m@gmaill.com")
            .clickCreateAnAccountBtn()
            .checkErrorMessageIsDIsplaye()
    }

    @Test
    fun verifyThatUserIsNotAbleToSignUpWithEmptyEmailAddress_RP_03(){
        HomePage(driver)
            .clickSignInBtnForRegister()
            .registerPageIsDisplayed()
            .clickCreateAnAccountBtn()
            .checkErrorMessageIsDIsplaye()
    }

}