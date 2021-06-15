package tests;

import driver.DriverThreadManager;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OrangeHRMHomePage;
import pages.OrangeHRMLoginPage;

public class OrangeHRMLoginTest extends TestBase{

    //OrangeHRMLoginPage orangeHRMLoginPage;

    @Test
    public void performOrangeHRMLogin(){
        String actualTitle = new OrangeHRMLoginPage().enterUsername("admin").enterPassword("admin123").clickOnLoginButton()
                .clickOnWelcomeLink().clickOnLogout().getLoginPageTitle();

        Assertions.assertThat(actualTitle)
                .isNotNull()
                .contains("OrangeHRM");

    }

}
