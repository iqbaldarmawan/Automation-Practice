package sorabelTest.Test

import sorabelTest.driverutil.DriverFactory
import org.junit.After
import org.junit.Before
import org.openqa.selenium.WebDriver

/**
 * Created by Iqbal Darmawan on 6/04/2019
 */

open class BasePageTestWeb{

    lateinit var driver: WebDriver
        private set

    @Before
    fun setUp() {
        driver = DriverFactory.browser
        driver.get("http://automationpractice.com")
    }

    @After
    fun tearDown() {
        driver.quit()
    }
}
