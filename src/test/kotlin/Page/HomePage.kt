package sorabelTest.Page

import Page.LoginPage
import org.openqa.selenium.WebDriver

/**
 * Created by Iqbal Darmawan on 6/04/2019
 */

class HomePage(driver: WebDriver) : BasePageWeb(driver) {

    fun checkTitileIsDisplayed() : HomePage{
        assertTitlePageIsEquals("My Store")
        return this
    }

    fun checkHomePageIsDisplayed(): HomePage{
        checkTitileIsDisplayed()
        return this
    }

    fun checkBannerTopIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("header#header div.banner > div > div > a > img")
        return this
    }

    fun checkCallUsNowIsDisplayed():HomePage{
        assertTextElementIsEqualsByCssSelector("header#header span > strong","0123-456-789")
        return this
    }

    fun checkContactUsNowButtonIsDsiplayed():HomePage{
        assertElementIsDisplayedById("contact-link")
        return this
    }

    fun checkSignInButtonIsDisplayed():HomePage{
        assertElementIsDisplayedByClassName("login")
        return this
    }

    fun checkLogoIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("#header_logo > a > img")
        return this
    }

    fun checkSearchBoxIsDisplayed():HomePage{
        assertElementIsDisplayedById("search_query_top")
        return this
    }

    fun checkSearchButtonIsDisplayed():HomePage{
        assertElementIsDisplayedByName("submit_search")
        return this
    }

    fun checkShoppingCartIsDisplayed():HomePage{
        assertElementIsDisplayedByClassName("shopping_cart")
        return this
    }

    fun checkWomenBarMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("#block_top_menu > ul > li:nth-child(1) > a")
        return this
    }

    fun checkDressesBarMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("#block_top_menu > ul > li:nth-child(2) > a")
        return this
    }

    fun checkTshirtBarMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("#block_top_menu > ul > li:nth-child(3) > a")
        return this
    }

    fun checkPopularBarIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("#home-page-tabs > li.active > a")
        return this
    }

    fun checkBestSellersBarIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("#home-page-tabs > li:nth-child(2) > a")
        return this
    }

    fun checkHoverDetailItemIsDIsplayed():HomePage{
        scrollToElementByCssSelector("ul#homefeatured li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img")
        hoverToElementByCssSelector("ul#homefeatured li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.last-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img")
        return this
    }

    fun checkAddToCartButtonIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("ul#homefeatured li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.last-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
        return this
    }

    fun checkMoreButtonIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.last-line.first-item-of-mobile-line.hovered > div > div.right-block > div.button-container > a.button.lnk_view.btn.btn-default")
        return this
    }

    fun checkPriceIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("ul#homefeatured li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.last-line.first-item-of-mobile-line.hovered > div > div.left-block > div > div.content_price > span.price.product-price")
        return this
    }

    fun checkSalePriceIsDIsplayed():HomePage{
        assertElementIsDisplayedByCssSelector("ul#homefeatured li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.last-line.first-item-of-mobile-line > div > div.left-block > div > div.content_price > span.price-percent-reduction")
        return this
    }

    fun checkTopTrendsBannerIsDisplayed():HomePage{
        scrollToElementByCssSelector("div#htmlcontent_home li.htmlcontent-item-1.col-xs-4 > a > img")
        assertElementIsDisplayedByCssSelector("div#htmlcontent_home li.htmlcontent-item-1.col-xs-4 > a > img")
        return this
    }

    fun checkMensCoatsBannerIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("div#htmlcontent_home li.htmlcontent-item-2.col-xs-4 > a > img")
        return this
    }

    fun checkWomensCoatsAndJackersBannerIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("div#htmlcontent_home li.htmlcontent-item-3.col-xs-4 > a > img")
        return this
    }

    fun checkSunglassesBannerIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("div#htmlcontent_home li.htmlcontent-item-4.col-xs-4 > a > img")
        return this
    }

    fun checkSavvyTrendsHandbagsBannerIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("div#htmlcontent_home li.htmlcontent-item-5.col-xs-4 > a > img")
        return this
    }

    fun clickSignInBtnForRegister():RegisterPage{
        clickElementByCssSelector("header#header div.header_user_info > a")
        return RegisterPage(driver)
    }

    fun clickSignInBtnForLogin():LoginPage{
        clickElementByCssSelector("header#header div.header_user_info > a")
        return LoginPage(driver)
    }

    fun checkNewsletterFIeldIsDisplayed():HomePage{
        scrollToElementByCssSelector("section#social_block li.facebook > a")
        assertElementIsDisplayedById("newsletter-input")
        return this
    }

    fun checkFacebookLogoFollowUsIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#social_block li.facebook > a")
        return this
    }

    fun checkTwitterLogoFollowUsIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#social_block li.twitter > a")
        return this
    }

    fun checkYoutubeLogoFollowUsIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#social_block li.youtube > a")
        return this
    }

    fun checkGooglePlusLogoFollowUsIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#social_block li.google-plus > a")
        return this
    }

    fun checkWomenInFooterCategoriesMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("footer#footer div > div > ul > li > a")
        return this
    }

    fun checkSpecialsInFooterInformationMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#block_various_links_footer li:nth-child(1) > a")
        return this
    }

    fun checkNewProductsInFooterInformationMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#block_various_links_footer li:nth-child(2) > a")
        return this
    }

    fun checkBestSellersInFooterInformationMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#block_various_links_footer li:nth-child(3) > a")
        return this
    }

    fun checkOurStoreInFooterInformationMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#block_various_links_footer li:nth-child(4) > a")
        return this
    }

    fun checkContactUsInFooterInformationMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#block_various_links_footer li:nth-child(5) > a")
        return this
    }

    fun checkTermsAndConditionInFooterInformationMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#block_various_links_footer li:nth-child(6) > a")
        return this
    }

    fun checkAboutUsInFooterInformationMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#block_various_links_footer li:nth-child(7) > a")
        return this
    }

    fun checkSiteMapInFooterInformationMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#block_various_links_footer li:nth-child(8) > a")
        return this
    }

    fun checkMyOrdersInFooterMyAccountMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("footer#footer section:nth-child(7) > div > ul > li:nth-child(1) > a")
        return this
    }

    fun checkMyCreditsInFooterMyAccountMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("footer#footer div > ul > li:nth-child(2) > a")
        return this
    }

    fun checkMyAddressInFooterMyAccountMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("footer#footer div > ul > li:nth-child(3) > a")
        return this
    }

    fun checkMyPersonalInfoInFooterMyAccountMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("footer#footer div > ul > li:nth-child(4) > a")
        return this
    }

    fun checkLocationInformationInFooterMenuIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("section#block_contact_infos li:nth-child(1)")
        return this
    }

    fun checkCallUsNowInFooterMenuIsDisplayed():HomePage{
        assertTextElementIsEqualsByCssSelector("section#block_contact_infos li:nth-child(2) > span","(347) 466-7432")
        return this
    }

    fun checkEmailInFooterMenuIsDisplayed():HomePage{
        assertTextElementIsEqualsByCssSelector("section#block_contact_infos a","support@seleniumframework.com")
        return this
    }

    fun clickSearchBar() :HomePage{
        clickElementByCssSelector("#search_query_top")
        return this
    }

    fun inputSearchBar(itemName : String) :HomePage{
        inputElementByCssSelector("#search_query_top",itemName)
        return this
    }

    fun clickSearchButton() :HomePage{
        clickElementByCssSelector("form#searchbox > button[type=\"submit\"]")
        return this
    }

    fun checkSearchPageIsDisplayed() :HomePage{
        assertElementIsDisplayedByCssSelector("#center_column > h1")
        return this
    }
    fun checkErrorMessageIsDisplayed():HomePage{
        assertElementIsDisplayedByCssSelector("div#center_column > p")
        return this
    }

}

