package by.itacademy.yatsevichpavel.by.mirtexno;

import by.itacademy.yatsevichpavel.by.mirtexno.pageges.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirtexnoTest extends BaseTest {

    @Test
    public void testOpenStartPageOnSite(){
        HomePage homePage = new HomePage(driver);
        homePage.scrollToFooterCopyriteWebElement();
        Assertions.assertEquals(homePage.MAIN_PAGE_SITE_FOOTER_COPYRITE_TEXT, homePage.getMainPageSiteFooterCopyriteText());
    }
}
