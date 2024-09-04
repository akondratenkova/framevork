package tests.searchPage;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.REALT_HOME_PAGE;

public class SearchAppartmentTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing(){
        basePage.open(REALT_HOME_PAGE);

        realtHomePage
                .enterCountRooms()
                .clickToFind();

    }
}
