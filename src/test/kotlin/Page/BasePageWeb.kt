package sorabelTest.Page

import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.Select
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException
import java.util.*
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.JavascriptExecutor


/**
 * Created by Iqbal Darmawan on 6/04/2019
 */

open class BasePageWeb(var driver: WebDriver){

    init {
        PageFactory.initElements(driver, this)
    }

    fun getElementById(id: String): WebElement {
        return driver.findElement(By.id(id))
    }

    fun getElementByName(name: String): WebElement {
        return driver.findElement(By.name(name))
    }

    fun getElementByClassName(className: String): WebElement {
        return driver.findElement(By.className(className))
    }

    fun getElementByXPath(xPath: String): WebElement {
        return driver.findElement(By.xpath(xPath))
    }

    fun getElementByCssSelector(cssSelector: String): WebElement {
        return driver.findElement(By.cssSelector(cssSelector))
    }

    fun getElementByTagName(tagName: String): WebElement {
        return driver.findElement(By.tagName(tagName))
    }

    fun getElementByLinkText(linkText: String): WebElement {
        return driver.findElement(By.linkText(linkText))
    }

    fun getElementByPartialLinkText(partialLinkText: String): WebElement {
        return driver.findElement(By.partialLinkText(partialLinkText))
    }

    fun clickElementById(id: String) {
        assertElementIsDisplayedById(id)
        getElementById(id).click()
    }

    fun clickElementByClassName(className: String) {
        assertElementIsDisplayedById(className)
        getElementById(className).click()
    }

    fun clickElementByName(name: String) {
        assertElementIsDisplayedByName(name)
        getElementByName(name).click()
    }

    fun clickElementByCssSelector(cssSelector: String) {
        assertElementIsDisplayedByCssSelector(cssSelector)
        getElementByCssSelector(cssSelector).click()
    }

    fun inputElementByCssSelector(cssSelector: String, text: String) {
        assertElementIsDisplayedByCssSelector(cssSelector)
        getElementByCssSelector(cssSelector).sendKeys(text)
    }

    fun getTextOrValueElementByCssSelector(cssSelector: String): String {
        assertElementIsDisplayedByCssSelector(cssSelector)
        return getElementByCssSelector(cssSelector).getText()
    }

    fun assertTrue(message: String, condition: Boolean) {
        org.junit.Assert.assertTrue(message, condition)
    }

    fun assertEquals(message: String, expected: String, actual: String) {
        org.junit.Assert.assertEquals(message, expected, actual)
    }

    fun isElementPresent(webElement: WebElement): Boolean {
        return webElement.isDisplayed()
    }

    fun assertElementIsDisplayedById(id: String) {
        assertTrue(
            "Failed : " + getElementById(id).toString() + " Is Not Displayed",
            isElementPresent(getElementById(id))
        )
    }

    fun assertElementIsDisplayedByClassName(className: String) {
        assertTrue(
            "Failed : " + getElementByClassName(className).toString() + " Is Not Displayed",
            isElementPresent(getElementByClassName(className))
        )
    }

    fun assertElementIsDisplayedByName(name: String) {
        assertTrue(
            "Failed : " + getElementByName(name).toString() + " Is Not Displayed",
            isElementPresent(getElementByName(name))
        )
    }

    fun assertElementIsDisplayedByCssSelector(cssSelector: String) {
        assertTrue(
            "Failed : " + getElementByCssSelector(cssSelector).toString() + " Is Not Displayed",
            isElementPresent(getElementByCssSelector(cssSelector))
        )
    }

    fun assertTextElementIsEqualsByCssSelector(cssSelector: String, expected: String) {
        val actual = getTextOrValueElementByCssSelector(cssSelector)
        assertEquals("Failed : $actual Not Equals With $expected", expected, actual)
    }

    fun assertTitlePageIsEquals(expected: String) {
        val actual = driver.getTitle()
        Assert.assertEquals("Failed : $actual Not Equals With $expected", expected, actual)
    }

    fun selectDropDownByVisibleText(webElement: WebElement, valueToSelect: String) {
        val select = Select(webElement)
        val options = select.options
        for (item in options) {
            if (item.text.contains(valueToSelect)) {
                select.selectByVisibleText(item.text)
                break
            }
        }
    }

    fun threadSleep(milis: Long) {
        Thread.sleep(milis)
    }

    fun writeTextToFile(fileName: String, textToWrite: String) {
        try {
            val out = BufferedWriter(FileWriter(fileName, true))
            out.write(textToWrite)
            out.newLine()
            out.close()

        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun getRandomNumberAndChar(amountNumber: Int): String {
        val charsToRandom = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
        val chars = StringBuilder()
        val rnd = Random()
        while (chars.length < 10) { // length of the random string.
            val index = (rnd.nextFloat() * charsToRandom.length).toInt()
            chars.append(charsToRandom[index])
        }
        return chars.toString()
    }

    internal var stringBuilder = StringBuilder()
    internal var randomGenerator = Random()

    fun getRandomNumber(amountNumber: Int): String {
        for (i in 1..amountNumber) {
            val randomInt = randomGenerator.nextInt(10)
            stringBuilder.append(randomInt)
        }
        return stringBuilder.toString()
    }

    fun hoverToElementByCssSelector(cssSelector : String ){
        val targetElement = getElementByCssSelector(cssSelector)
        val actions = Actions(driver)
        actions.moveToElement(targetElement).perform()
    }

    fun scrollToElementByCssSelector(cssSelector : String){
        val element = getElementByCssSelector(cssSelector)
        (driver as JavascriptExecutor).executeScript("arguments[0].scrollIntoView(true);", element)
    }
}
