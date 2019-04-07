package Test

import org.junit.Test
import sorabelTest.Page.HomePage
import sorabelTest.Test.BasePageTestWeb

class HomePgeTest :BasePageTestWeb() {


    @Test
    fun checkHomePageHeaderElementIsDisplayed_HP_01() {
        HomePage(driver)
            .checkHomePageIsDisplayed()
            .checkBannerTopIsDisplayed()
            .checkCallUsNowIsDisplayed()
            .checkContactUsNowButtonIsDsiplayed()
            .checkSignInButtonIsDisplayed()
            .checkLogoIsDisplayed()
            .checkSearchBoxIsDisplayed()
            .checkSearchButtonIsDisplayed()
            .checkShoppingCartIsDisplayed()
            .checkWomenBarMenuIsDisplayed()
            .checkDressesBarMenuIsDisplayed()
            .checkTshirtBarMenuIsDisplayed()
    }

    @Test
    fun checkHomePageDetailItemsElementIsDisplayed_HP_02() {
        HomePage(driver)
            .checkPopularBarIsDisplayed()
            .checkBestSellersBarIsDisplayed()
            .checkHoverDetailItemIsDIsplayed()
            .checkAddToCartButtonIsDisplayed()
            .checkMoreButtonIsDisplayed()
            .checkPriceIsDisplayed()
            .checkSalePriceIsDIsplayed()
            .checkTopTrendsBannerIsDisplayed()
            .checkMensCoatsBannerIsDisplayed()
            .checkWomensCoatsAndJackersBannerIsDisplayed()
            .checkSunglassesBannerIsDisplayed()
            .checkSavvyTrendsHandbagsBannerIsDisplayed()
    }

    @Test
    fun checkHomePageFooterElementIsDisplayed_HP_03() {
        HomePage(driver)
            .checkNewsletterFIeldIsDisplayed()
            .checkFacebookLogoFollowUsIsDisplayed()
            .checkTwitterLogoFollowUsIsDisplayed()
            .checkYoutubeLogoFollowUsIsDisplayed()
            .checkGooglePlusLogoFollowUsIsDisplayed()
            .checkWomenInFooterCategoriesMenuIsDisplayed()
            .checkSpecialsInFooterInformationMenuIsDisplayed()
            .checkNewProductsInFooterInformationMenuIsDisplayed()
            .checkBestSellersInFooterInformationMenuIsDisplayed()
            .checkOurStoreInFooterInformationMenuIsDisplayed()
            .checkContactUsInFooterInformationMenuIsDisplayed()
            .checkTermsAndConditionInFooterInformationMenuIsDisplayed()
            .checkAboutUsInFooterInformationMenuIsDisplayed()
            .checkSiteMapInFooterInformationMenuIsDisplayed()
            .checkMyOrdersInFooterMyAccountMenuIsDisplayed()
            .checkMyCreditsInFooterMyAccountMenuIsDisplayed()
            .checkMyAddressInFooterMyAccountMenuIsDisplayed()
            .checkMyPersonalInfoInFooterMyAccountMenuIsDisplayed()
            .checkLocationInformationInFooterMenuIsDisplayed()
            .checkCallUsNowInFooterMenuIsDisplayed()
            .checkEmailInFooterMenuIsDisplayed()
    }

    @Test
    fun checkItemIsDisplayedIfUserSearchAvailableItem_HP_04() {
        HomePage(driver)
            .clickSearchBar()
            .inputSearchBar("Blouse")
            .clickSearchButton()
            .checkSearchPageIsDisplayed()
    }

    @Test
    fun checkErrorMessageIsDisplayedIfSearchEmptyItemm_HP_05() {
        HomePage(driver)
            .clickSearchBar()
            .inputSearchBar("asd")
            .clickSearchButton()
            .checkErrorMessageIsDisplayed()
    }

    @Test
    fun CheckMatchesItemViaSubstring_HP_06() {
        HomePage(driver)
            .clickSearchBar()
            .inputSearchBar("Blo")
            .clickSearchButton()
            .checkSearchPageIsDisplayed()
    }

    @Test
    fun checkErrorMessageIsDisplayedIfSearchWithEmptyKeywords_HP_07() {
        HomePage(driver)
            .clickSearchBar()
            .clickSearchButton()
            .checkErrorMessageIsDisplayed()
    }
}