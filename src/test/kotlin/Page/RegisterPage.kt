package sorabelTest.Page

import org.openqa.selenium.WebDriver

/**
 * Created by Iqbal Darmawan on 6/04/2019
 */

class RegisterPage (driver: WebDriver) : BasePageWeb(driver) {

    val randomEmail: String = getRandomNumberAndChar(10) + "@gmaill.com"

    fun registerPageIsDisplayed():RegisterPage{
        assertTitlePageIsEquals("Login - My Store")
        return this
    }

    fun inputEmailAddress():RegisterPage{
        inputElementByCssSelector("input#email_create", randomEmail)
        writeTextToFile("emailRegister.txt",randomEmail)
        return this
    }

    fun inputInvalidEmailAddress(invalidEmail : String):RegisterPage{
        inputElementByCssSelector("input#email_create", invalidEmail)
        return this
    }

    fun clickCreateAnAccountBtn():RegisterPage{
        clickElementByCssSelector("button#SubmitCreate > span")
        return this
    }

    fun checkPersonalInformationPageIsDisplayed():RegisterPage{
        assertTextElementIsEqualsByCssSelector("form#account-creation_form div:nth-child(1) > h3","YOUR PERSONAL INFORMATION")
        return this
    }

    fun clickBtnMr():RegisterPage{
        clickElementByCssSelector("input#id_gender1")
        return this
    }

    fun inputFirstNamePersonalInfo(firstName : String):RegisterPage{
        inputElementByCssSelector("input#customer_firstname",firstName)
        return this
    }

    fun inputLastNamePersonalInfo(lastName : String):RegisterPage{
        inputElementByCssSelector("input#customer_lastname",lastName)
        return this
    }

    fun inputEmail():RegisterPage{
        clickElementByCssSelector("input#email")
        return this
    }

    fun inputPassword(password : String):RegisterPage{
        inputElementByCssSelector("input#passwd",password)
        return this
    }

    fun selectDayOfrBirth(dayBirth : String):RegisterPage{
        selectDropDownByVisibleText(getElementById("days"),dayBirth)
        return this
    }

    fun selectMonthOfBirthd(monthBirth : String):RegisterPage{
        selectDropDownByVisibleText(getElementById("months"),monthBirth)
        return this
    }

    fun selectYearOfBirthd(yearBirth : String):RegisterPage{
        selectDropDownByVisibleText(getElementById("years"),yearBirth)
        return this
    }

    fun inputFirstName(firstName : String):RegisterPage{
        inputElementByCssSelector("input#firstname",firstName)
        return this
    }

    fun inputLastName(lastName : String):RegisterPage{
        inputElementByCssSelector("input#lastname",lastName)
        return this
    }

    fun inputCompanyName(companyName : String):RegisterPage{
        inputElementByCssSelector("input#company",companyName)
        return this
    }

    fun inputAddress(address : String):RegisterPage{
        inputElementByCssSelector("input#address1",address)
        return this
    }

    fun inputAddressLine2(address : String):RegisterPage{
        inputElementByCssSelector("input#address2",address)
        return this
    }

    fun inputCity(city : String):RegisterPage{
        inputElementByCssSelector("input#city",city)
        return this
    }

    fun selectState(state : String):RegisterPage{
        selectDropDownByVisibleText(getElementByCssSelector("select#id_state"),state)
        return this
    }

    fun inputZip(zip : String):RegisterPage{
        inputElementByCssSelector("input#postcode",zip)
        return this
    }

    fun selectCountry(country : String):RegisterPage{
        selectDropDownByVisibleText(getElementByCssSelector("select#id_country"),country)
        return this
    }

    fun inputAdditionalInfo(additionalInfo : String):RegisterPage{
        inputElementByCssSelector("textarea#other",additionalInfo)
        return this
    }

    fun inputHomePhone():RegisterPage{
        var randomHomePhoneNumber : String = getRandomNumber(7)
        inputElementByCssSelector("input#phone", randomHomePhoneNumber)
        writeTextToFile("homePhone.txt",randomHomePhoneNumber)
        return this
    }

    fun inputMobilePhone():RegisterPage{
        var randomMobilePhoneNumber : String = "08" + getRandomNumber(3)
        inputElementByCssSelector("input#phone_mobile", randomMobilePhoneNumber)
        writeTextToFile("mobilePhone.txt",randomMobilePhoneNumber)
        return this
    }

    fun inputAddressAlias(address: String):RegisterPage{
        inputElementByCssSelector("input#alias",address)
        return this
    }

    fun clickRegisterBtn():RegisterPage{
        clickElementByCssSelector("button#submitAccount > span")
        threadSleep(1000)
        return this
    }

    fun checkErrorMessageIsDIsplaye():RegisterPage{
        assertElementIsDisplayedByCssSelector("div#create_account_error li")
        return this
    }
}