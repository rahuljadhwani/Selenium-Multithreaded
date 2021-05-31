package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import driver.DriverSetup;

public class TestBase {

    protected TestBase(){

    }

    @BeforeMethod
    public void setUp(){
        DriverSetup.initDriver();
    }

    @AfterMethod
    public void tearDown() {
        DriverSetup.quitDriver();
    }
}
