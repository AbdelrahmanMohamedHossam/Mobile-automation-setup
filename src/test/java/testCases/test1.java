package testCases;
import base.baseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class test1 extends baseTest{

    @Test(priority = 1)
    public void firstRun()
    {
        System.out.println("==================>   im here ");
    }

}
