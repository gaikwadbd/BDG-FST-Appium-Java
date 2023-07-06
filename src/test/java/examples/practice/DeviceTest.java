package examples.practice;


import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Created by Bharat  on 30/6/2023.
 */

public class DeviceTest extends BasesetUpTest {

    @Test
    public void getDeviceInfo() {

        // findElement(By.xpath) and takeScreenShot for the JSON result
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]\n")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")).click();
        driver.findElement(By.id("android:id/alertTitle"));

        // Check if test finished with JSON's result or with an error
        String result = driver.findElement(By.id("android:id/alertTitle")).getText();
        s_assert.assertEquals(result, "Test Finished", "Test Finished did not match with Actual test result: " + result);
        s_assert.assertAll();

        // Print the JSON's test results
        String result2 = driver.findElement(By.id("android:id/message")).getText();
        System.out.println(result2);

        // Go back to main  app categories screen
        driver.findElement(By.id("android:id/button1")).click();
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    }

    @Test
    public void getDeviceUniqId() {
        // findElement(By.xpath)
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]\n")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView\n")).click();
        driver.findElement(By.id("android:id/alertTitle"));

        // Check if test finished with JSON's result or with an error
        String result = driver.findElement(By.id("android:id/alertTitle")).getText();
        s_assert.assertEquals(result, "Test Finished", "Test Finished did not match with Actual test result: " + result);
        s_assert.assertAll();

        // Print the JSON's test results
        String result2 = driver.findElement(By.id("android:id/message")).getText();
        System.out.println(result2);

        // Go back to main  app categories screen
        driver.findElement(By.id("android:id/button1")).click();
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    }

    @Test
    public void getRooted() {
        // findElement(By.xpath)
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]\n")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView\n")).click();
        driver.findElement(By.id("android:id/alertTitle"));

        // Check if test finished with JSON's result or with an error
        String result = driver.findElement(By.id("android:id/alertTitle")).getText();
        s_assert.assertEquals(result, "Test Finished", "Test Finished did not match with Actual test result: " + result);
        s_assert.assertAll();

        // Print the JSON's test results
        String result2 = driver.findElement(By.id("android:id/message")).getText();
        System.out.println(result2);

        // Go back to main  app categories screen
        driver.findElement(By.id("android:id/button1")).click();
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    }

    @Test
    public void getCPUPerformance() {
        // findElement(By.xpath)
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]\n")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.TextView\n")).click();
        driver.findElement(By.id("android:id/alertTitle"));

        // Check if test finished with JSON's result or with an error
        String result = driver.findElement(By.id("android:id/alertTitle")).getText();
        s_assert.assertEquals(result, "Test Finished", "Test Finished did not match with Actual test result: " + result);
        s_assert.assertAll();

        // Print the JSON's test results
        String result2 = driver.findElement(By.id("android:id/message")).getText();
        System.out.println(result2);

        // Go back to main  app categories screen
        driver.findElement(By.id("android:id/button1")).click();
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}