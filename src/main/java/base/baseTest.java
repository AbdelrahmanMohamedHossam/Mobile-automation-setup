package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {

    public AndroidDriver driver;

    @BeforeTest
    public void bT() throws MalformedURLException {
//cmd commands
//        1-Mycurrent app command : adb shell dumpsys window | find "mCurrentFocus"
//        2-device name : adb devices

        DesiredCapabilities dC = new DesiredCapabilities() ;
        dC.setCapability("deviceName","");
        dC.setCapability("appPackage","");
        dC.setCapability("appActivity","");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dC);


    }
}
