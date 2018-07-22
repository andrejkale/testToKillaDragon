package Tests;

import Helpers.App;
import org.testng.annotations.*;

public abstract class BaseTest {
    App app  = new App();

    @BeforeSuite
    public void setSuite() throws Exception {
    }

    @BeforeTest
    public void setTest() throws Exception {
        app.common.appBefore();

    }

    @AfterMethod
    public void tearDownAfterTest() throws Exception {
        app.common.appOutAfterTest();
    }

    @AfterSuite
    public void tearDown() throws Exception {
        app.common.appOut();

    }
}
